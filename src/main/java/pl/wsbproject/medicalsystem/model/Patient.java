package pl.wsbproject.medicalsystem.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Data
@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, length = 9)
    private long pesel;
    private String name;
    private String surname;
    private LocalDate dob;
    @Transient
    private Integer age;
    private String address;
    private long postcode;
    private String town;
    @Column(name = "phone_number")
    private long phoneNumber;
    private String email;

    @OneToMany(targetEntity = Examination.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ep_fk", referencedColumnName = "id")
    private List<Examination> examinations;

    @OneToMany(targetEntity = Appointment.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ap_fk", referencedColumnName = "id")
    private List<Appointment> appointments;

    @OneToMany(targetEntity = Treatment.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_fk", referencedColumnName = "id")
    private List<Treatment> treatments;


    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public Patient(long pesel, String name, String surname,LocalDate dob, String address, long postcode, String town, long phoneNumber, String email) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.address = address;
        this.postcode = postcode;
        this.town = town;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


}
