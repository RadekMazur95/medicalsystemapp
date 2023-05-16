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
@Table(name = "type_of_treatment")
public class TypeOfTreatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(targetEntity = Treatment.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_fk", referencedColumnName = "id")
    private List<Treatment> treatments;

    public TypeOfTreatment(String name) {
        this.name = name;
    }
}