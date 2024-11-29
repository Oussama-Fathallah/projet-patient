package app.patient.sensordataservice.repositories;


import app.patient.sensordataservice.entities.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {
    List<SensorData> findByPatientId(Long patientId);
}
