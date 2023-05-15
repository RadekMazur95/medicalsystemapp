package pl.wsbproject.medicalsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.wsbproject.medicalsystem.model.Appointment;
import pl.wsbproject.medicalsystem.repository.AppointmentRepository;

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



}
