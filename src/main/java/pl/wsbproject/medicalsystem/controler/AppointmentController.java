package pl.wsbproject.medicalsystem.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.model.Appointment;
import pl.wsbproject.medicalsystem.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/appointment")
public class AppointmentController {

    @Autowired
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(path = "/list")
    public List<Appointment> getAppointment(){
        return appointmentService.getAppointments();
    }

    @PostMapping(path = "/add")
    public void addNewAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointments(appointment);
    }


}
