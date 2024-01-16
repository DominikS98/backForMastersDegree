package pl.magisterka.dominikszojda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.magisterka.dominikszojda.entity.DogEntity;

import java.util.UUID;
@Repository
public interface DogRepository extends CrudRepository<DogEntity, UUID>{



}
