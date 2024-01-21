package pl.magisterka.dominikszojda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.magisterka.dominikszojda.entity.DogEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface DogRepository extends CrudRepository<DogEntity, UUID>{


    Optional<DogEntity> findByNameAndAge(String name, int age);

    DogEntity assignDogToOwner(UUID dogId, UUID ownerId);


    List<DogEntity> findAll();


    Optional<DogEntity> findById(UUID uuid);

     List<DogEntity> findDogByOwnerId(UUID ownerId);



}
