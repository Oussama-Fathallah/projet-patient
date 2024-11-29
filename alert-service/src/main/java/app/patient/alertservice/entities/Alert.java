package app.patient.alertservice.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import app.patient.patientservice.entities.Patient;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String alertType; // e.g., inactivity, mobility_loss
    private String message;
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


}
