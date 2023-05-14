package pl.wsbproject.medicalsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drug")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "drug_form")
    private String drugForm;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "dosage")
    private String dosage;

    @ManyToMany(mappedBy = "drugs")
    private List<Examination> examinationList = new ArrayList<>();

    public Drug(String name, String drugForm) {
        this.name = name;
        this.drugForm = drugForm;
    }

    public Drug(String name, String drugForm, int quantity, String dosage) {
        this.name = name;
        this.drugForm = drugForm;
        this.quantity = quantity;
        this.dosage = dosage;
    }
}
