package app.patient.alertservice.services;


import app.patient.alertservice.entities.Alert;
import app.patient.alertservice.repositories.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }

    public Alert addAlert(Alert alert) {
        return alertRepository.save(alert);
    }

    public List<Alert> getAlertsByPatientId(Long patientId) {
        return alertRepository.findByPatientId(patientId);
    }
}
