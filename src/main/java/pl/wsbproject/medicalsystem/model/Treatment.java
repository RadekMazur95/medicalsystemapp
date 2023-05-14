package pl.wsbproject.medicalsystem.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "treatment")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "treatment_price")
    private double treatmentPrice;
    @Column(name = "treatment_duration")
    private LocalTime treatmentDuration;
    @Column(name = "treatment_date")
    private LocalDate treatmentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_of_treatment_id")
    private TypeOfTreatment typeOfTreatment;

    public Treatment(double treatmentPrice, LocalTime treatmentDuration, LocalDate treatmentDate) {
        this.treatmentPrice = treatmentPrice;
        this.treatmentDuration = treatmentDuration;
        this.treatmentDate = treatmentDate;
    }
}

