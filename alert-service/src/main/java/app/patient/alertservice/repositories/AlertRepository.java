package app.patient.alertservice.repositories;


import app.patient.alertservice.entities.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByPatientId(Long patientId);
}
