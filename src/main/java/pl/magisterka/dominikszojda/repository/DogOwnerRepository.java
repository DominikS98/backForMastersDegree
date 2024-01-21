package pl.magisterka.dominikszojda.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DogOwnerRepository  extends CrudRepository<DogOwnerEntity, UUID> {

    List<DogOwnerEntity> findAll();



    public DogOwnerEntity findDogOwnerByName(String name);


}
