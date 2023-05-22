package pl.wsbproject.medicalsystem.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "appointment_duration")
    private LocalTime appointmentDuration;
    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    public Appointment(LocalTime appointmentDuration, LocalDate appointmentDate) {
        this.appointmentDuration = appointmentDuration;
        this.appointmentDate = appointmentDate;
    }
}
