package app.patient.sensordataservice.controller;

import app.patient.sensordataservice.entities.SensorData;
import app.patient.sensordataservice.services.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensordata")
public class SensorDataController {

    @Autowired
    private SensorDataService sensorDataService;

    @GetMapping
    public List<SensorData> getAllSensorData() {
        return sensorDataService.getAllSensorData();
    }

    @PostMapping
    public SensorData createSensorData(@RequestBody SensorData sensorData) {
        return sensorDataService.saveSensorData(sensorData);
    }

    @GetMapping("/{id}")
    public SensorData getSensorDataById(@PathVariable Long id) {
        return sensorDataService.getSensorDataById(id);
    }

    @PutMapping("/{id}")
    public SensorData updateSensorData(@PathVariable Long id, @RequestBody SensorData sensorData) {
        return sensorDataService.updateSensorData(id, sensorData);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorData(@PathVariable Long id) {
        sensorDataService.deleteSensorData(id);
    }
}
