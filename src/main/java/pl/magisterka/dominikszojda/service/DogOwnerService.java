package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogOwnerResponseDto;

import java.util.List;

public interface DogOwnerService {

    DogOwnerResponseDto createDog(DogOwnerCreateRequestDto dto);

    List<DogOwnerEntity> getDogOwners();
}
