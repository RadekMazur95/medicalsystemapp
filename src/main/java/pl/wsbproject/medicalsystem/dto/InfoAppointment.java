package pl.wsbproject.medicalsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@ToString
public class InfoAppointment {

    private Long id;
    private LocalTime appointmentDuration;
    private LocalDate appointmentDate;

    public InfoAppointment(Long id, LocalTime appointmentDuration, LocalDate appointmentDate) {
        this.id = id;
        this.appointmentDuration = appointmentDuration;
        this.appointmentDate = appointmentDate;
    }

}
