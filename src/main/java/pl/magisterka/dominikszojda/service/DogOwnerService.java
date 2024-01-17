package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogOwnerResponseDto;

public interface DogOwnerService {

    DogOwnerResponseDto createDog(DogOwnerCreateRequestDto dto);
}
