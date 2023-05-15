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
                    "Radek",
                    "Mazur",
                    LocalDate.of(1995, 04, 07),
                    "Jacowskiego",
                    60153L,
                    "Poznan",
                    602532132L,
                    "radek@gmail.com"
            );
            Patient patient2 = new Patient(
                    940203921L,
                    "Aleksandra",
                    "Mazur",
                    LocalDate.of(1994, 05, 04),
                    "Gowinskiego",
                    60148L,
                    "ZielonaGora",
                    640231456L,
                    "ola@gmail.com"
            );

            repository.saveAll(
                    List.of(patient1, patient2)
            );
        };
    }
}
