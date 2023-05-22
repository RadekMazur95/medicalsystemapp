package pl.wsbproject.medicalsystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsbproject.medicalsystem.model.Patient;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterTreatment {

    private Patient patient;
}
