package pl.wsbproject.medicalsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wsbproject.medicalsystem.dto.InfoAppointment;
import pl.wsbproject.medicalsystem.model.Patient;

import java.util.List;
import java.util.Optional;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p FROM Patient p WHERE p.email = ?1")
  Optional<Patient> findPatientByEmail(String email);

    @Query("SELECT new pl.wsbproject.medicalsystem.dto.InfoAppointment(p.id , a.appointmentDuration, a.appointmentDate) from Patient p JOIN p.appointments a")
    public List<InfoAppointment> getPatientAppointmentInfo();

}
