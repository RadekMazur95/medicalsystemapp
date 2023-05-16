package pl.wsbproject.medicalsystem.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "examination")
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "examination_date")
    private LocalDate examinationDate;
    @Column(name = "examination_time")
    private LocalTime examinationTime;
    @Column(name = "examination_price")
    private double examinationPrice;
    private long interview;
    private String diagnosis;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "prescribe_drug",
            joinColumns = { @JoinColumn(name = "examination_id") },
            inverseJoinColumns = { @JoinColumn(name = "drug_id") }
    )
    private List<Drug> drugs;


    public Examination(LocalDate examinationDate, LocalTime examinationTime, double examinationPrice, long interview, String diagnosis) {
        this.examinationDate = examinationDate;
        this.examinationTime = examinationTime;
        this.examinationPrice = examinationPrice;
        this.interview = interview;
        this.diagnosis = diagnosis;
    }
}