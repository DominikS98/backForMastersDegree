package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogResponseDto;

import java.util.List;
import java.util.UUID;

public interface DogService {

    DogResponseDto createDog(DogCreateRequestDto dto);

    List<DogEntity> getDogs();

    DogResponseDto getDogById(UUID UUID);

}
