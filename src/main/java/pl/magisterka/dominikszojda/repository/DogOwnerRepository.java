package pl.magisterka.dominikszojda.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;

import java.util.UUID;

@Repository
public interface DogOwnerRepository  extends CrudRepository<DogOwnerEntity, UUID> {

    public DogOwnerEntity findDogOwnerById(UUID id);

    public DogOwnerEntity findDogOwnerByName(String name);


}
