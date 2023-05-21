package pl.wsbproject.medicalsystem.controler;


import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.dto.InfoAppointment;
import pl.wsbproject.medicalsystem.dto.RegisterAppointment;
import pl.wsbproject.medicalsystem.model.Appointment;
import pl.wsbproject.medicalsystem.model.Patient;
import pl.wsbproject.medicalsystem.repository.AppointmentRepository;
import pl.wsbproject.medicalsystem.repository.PatientRepository;
import pl.wsbproject.medicalsystem.service.AppointmentService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping(path = "/api/appointment")
public class AppointmentController {

    @Autowired
    private PatientRepository patientRepository;


    @Autowired
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(path = "/list")
    public List<Appointment> getAppointment(){
        return appointmentService.getAppointments();
    }

    @PostMapping(path = "/register")
    public Patient registerNewAppointment(@RequestBody RegisterAppointment registerAppointment){
        return patientRepository.save(registerAppointment.getPatient());
    }

    @PostMapping(path = "/add")
    public void addNewAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointments(appointment);
    }

    @PutMapping(path = "/update/{appointmentId}")
    public void updatePatientAppointment(@PathVariable("appointmentId") Long appointmentId,
                                         @RequestParam(required = false)LocalTime appointmentDuration,
                                         @RequestParam(required = false)LocalDate appointmentDate){
        appointmentService.updatePatientAppointment(appointmentId, appointmentDuration, appointmentDate);

    }




}
