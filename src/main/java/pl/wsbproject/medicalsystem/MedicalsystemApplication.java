package pl.wsbproject.medicalsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MedicalsystemApplication {


    public static void main(String[] args) {
        SpringApplication.run(MedicalsystemApplication.class, args);









  /*      Patient patient = new Patient();
        Appointment appointment = new Appointment();
        patient.setPesel(950504030);
        patient.setName("Radek");
        patient.setAge(27);
        patient.setAddress("Jackowskiego");

        appointment.setAppointmentDate(LocalDate.of(2023,5,13));
        appointment.setAppointmentDuration(LocalTime.of(7,15));
  */
    }


}
