package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogResponseDto;

import java.util.List;
import java.util.UUID;

public interface DogService {

    DogResponseDto createDog(DogCreateRequestDto dto);

    List<DogEntity> getDogs();

    DogResponseDto getDogById(UUID uuid);

    DogEntity assignDogToOwner(UUID dogId, UUID ownerId);

}
