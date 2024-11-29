package app.patient.patientservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import app.patient.soignantservice.entities.Soignant;
import app.patient.sensordataservice.entities.SensorData;
import app.patient.alertservice.entities.Alert;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String medicalHistory;

    @ManyToOne
    @JoinColumn(name = "soignant_id")
    private Soignant soignant;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<SensorData> sensorDataList;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Alert> alerts;


}
