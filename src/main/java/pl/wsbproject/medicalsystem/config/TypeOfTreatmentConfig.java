package pl.wsbproject.medicalsystem.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsbproject.medicalsystem.model.TypeOfTreatment;
import pl.wsbproject.medicalsystem.repository.TypeOfTreatmentRepository;

import java.util.List;

@Configuration
public class TypeOfTreatmentConfig {

    @Bean
    CommandLineRunner commandLineRunner2(TypeOfTreatmentRepository typeOfTreatmentRepository){
        return args -> {
            TypeOfTreatment type1 = new TypeOfTreatment(
                "Gastroskopia"
            );
            TypeOfTreatment type2 = new TypeOfTreatment(
                    "Kolonoskopia"
            );
            TypeOfTreatment type3 = new TypeOfTreatment(
                    "Spirometria"
            );
            TypeOfTreatment type4 = new TypeOfTreatment(
                    "Pobranie krwi"
            );
            TypeOfTreatment type5 = new TypeOfTreatment(
                    "Pobranie moczu"
            );

            typeOfTreatmentRepository.saveAll(
                    List.of(type1, type2, type3, type4, type5)
            );

        };

    }

}
