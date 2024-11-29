package app.patient.soignantservice.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import app.patient.patientservice.entities.Patient;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Soignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "soignant", cascade = CascadeType.ALL)
    private List<Patient> patients;


}
