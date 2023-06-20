package projetTechno.SfApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import projetTechno.SfApp.models.entities.Bebe;

@Repository
public interface BebeRepository extends JpaRepository<Bebe, Integer>, JpaSpecificationExecutor {
}
