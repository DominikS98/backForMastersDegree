package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogResponseDto;

import java.util.List;

public interface DogService {

    DogResponseDto createDog(DogCreateRequestDto dto);

    List<DogEntity> getDogs();
}
