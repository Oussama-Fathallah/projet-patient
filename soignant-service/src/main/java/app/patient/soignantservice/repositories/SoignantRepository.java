package app.patient.soignantservice.repositories;

import app.patient.soignantservice.entities.Soignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoignantRepository extends JpaRepository<Soignant, Long> {

}
