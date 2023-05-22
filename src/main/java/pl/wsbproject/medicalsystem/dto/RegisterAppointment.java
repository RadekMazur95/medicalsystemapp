package pl.wsbproject.medicalsystem.dto;


import lombok.*;
import pl.wsbproject.medicalsystem.model.Patient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegisterAppointment {

    private Patient patient;
}
