package pl.magisterka.dominikszojda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.repository.DogRepository;

@Service
@RequiredArgsConstructor
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;


    public DogEntity createDog(DogEntity dogEntity) {
        dogEntity.setId(null);
        return dogRepository.save(dogEntity);
    }


}
