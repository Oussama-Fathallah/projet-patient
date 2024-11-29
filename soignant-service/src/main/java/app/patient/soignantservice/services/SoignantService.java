package app.patient.soignantservice.services;


import app.patient.soignantservice.entities.Soignant;
import app.patient.soignantservice.repositories.SoignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoignantService {

    @Autowired
    private SoignantRepository soignantRepository;

    public List<Soignant> getAllSoignants() {
        return soignantRepository.findAll();
    }

    public Soignant addSoignant(Soignant soignant) {
        return soignantRepository.save(soignant);
    }

    public Soignant getSoignantById(Long id) {
        return soignantRepository.findById(id).orElse(null);
    }

    public Soignant updateSoignant(Long id, Soignant soignant) {
        soignant.setId(id);
        return soignantRepository.save(soignant);
    }

    public void deleteSoignant(Long id) {
        soignantRepository.deleteById(id);
    }
}
