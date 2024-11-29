package app.patient.sensordataservice.services;


import app.patient.sensordataservice.entities.SensorData;
import app.patient.sensordataservice.repositories.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    public SensorData addSensorData(SensorData sensorData) {
        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getSensorDataByPatientId(Long patientId) {
        return sensorDataRepository.findByPatientId(patientId);
    }
}
