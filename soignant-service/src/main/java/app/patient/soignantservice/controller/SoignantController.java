package app.patient.soignantservice.controller;

import app.patient.soignantservice.entities.Soignant;
import app.patient.soignantservice.services.SoignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soignants")
public class SoignantController {

    @Autowired
    private SoignantService soignantService;

    @GetMapping
    public List<Soignant> getAllSoignants() {
        return soignantService.getAllSoignants();
    }

    @PostMapping
    public Soignant createSoignant(@RequestBody Soignant soignant) {
        return soignantService.saveSoignant(soignant);
    }

    @GetMapping("/{id}")
    public Soignant getSoignantById(@PathVariable Long id) {
        return soignantService.getSoignantById(id);
    }

    @PutMapping("/{id}")
    public Soignant updateSoignant(@PathVariable Long id, @RequestBody Soignant soignant) {
        return soignantService.updateSoignant(id, soignant);
    }

    @DeleteMapping("/{id}")
    public void deleteSoignant(@PathVariable Long id) {
        soignantService.deleteSoignant(id);
    }
}
