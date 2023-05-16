package pl.wsbproject.medicalsystem.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsbproject.medicalsystem.model.Appointment;
import pl.wsbproject.medicalsystem.repository.AppointmentRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Configuration
public class AppointmentConfig {

    @Bean
    CommandLineRunner commandLineRunner2(AppointmentRepository repository){

        return args -> {

            Appointment appointment1 = new Appointment(
                    LocalTime.now(),
                    LocalDate.now()
            );

            Appointment appointment2 = new Appointment(
                    LocalTime.of(8,30),
                    LocalDate.of(2023,05,14)

            );

            repository.saveAll(
                    List.of(appointment1, appointment2)
            );


        };

    }


}
