package pl.wsbproject.medicalsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wsbproject.medicalsystem.dto.InfoAppointment;
import pl.wsbproject.medicalsystem.dto.RegisterAppointment;
import pl.wsbproject.medicalsystem.model.Appointment;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
