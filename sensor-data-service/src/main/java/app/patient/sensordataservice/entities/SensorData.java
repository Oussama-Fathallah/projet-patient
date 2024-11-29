package app.patient.sensordataservice.entities;


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
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorType; // e.g., motion, pressure
    private Float value;
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


}
