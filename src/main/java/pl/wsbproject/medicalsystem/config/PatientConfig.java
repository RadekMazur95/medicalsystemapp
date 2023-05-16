package pl.wsbproject.medicalsystem.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsbproject.medicalsystem.model.Patient;
import pl.wsbproject.medicalsystem.repository.PatientRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PatientConfig {

    @Bean
    CommandLineRunner commandLineRunner1(PatientRepository repository) {
        return args -> {

            Patient patient1 = new Patient(
                    950503021L,
                    "Wiktor",
                    "Nowak",
                    LocalDate.of(1995, 04, 07),
                    "Przybyszewskiego",
                    50053L,
                    "Polkowice",
                    604532132L,
                    "wiktor@gmail.com"

            );
            Patient patient2 = new Patient(
                    980203921L,
                    "Karolina",
                    "Klos",
                    LocalDate.of(1984, 04, 01),
                    "Gowinskiego",
                    60148L,
                    "Zielona Gora",
                    640231456L,
                    "karola@gmail.com"
            );

            repository.saveAll(
                    List.of(patient1, patient2)
            );
        };
    }
}
