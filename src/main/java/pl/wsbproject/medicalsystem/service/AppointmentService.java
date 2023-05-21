package pl.wsbproject.medicalsystem.service;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsbproject.medicalsystem.model.Appointment;
import pl.wsbproject.medicalsystem.repository.AppointmentRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private final AppointmentRepository appointmentRepository;


    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }

    public void addAppointments(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    @Transactional
    public void updatePatientAppointment(Long appointmentId, LocalTime appointmentDuration, LocalDate appointmentDate){
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new IllegalStateException(
                        "appointmentId: " + appointmentId + "doesn't exists"));
        if (appointmentDuration != null) {
            appointment.setAppointmentDuration(appointmentDuration);
        }
         if (appointmentDate != null){
             appointment.setAppointmentDate(appointmentDate);
         }

    }







}
