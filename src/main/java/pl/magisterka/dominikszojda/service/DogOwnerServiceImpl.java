package pl.magisterka.dominikszojda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.mappers.DogOwnerMapper;
import pl.magisterka.dominikszojda.repository.DogOwnerRepository;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogOwnerResponseDto;

@RequiredArgsConstructor
@Service
public class DogOwnerServiceImpl implements DogOwnerService {

    private final DogOwnerRepository dogOwnerRepository;
    private final DogOwnerMapper dogOwnerMapper;

    public DogOwnerResponseDto createDog(DogOwnerCreateRequestDto dto) {



        DogOwnerEntity ownerEntity = dogOwnerMapper.toEntity(dto);

        return dogOwnerMapper.toResponse(dogOwnerRepository.save(ownerEntity));



    }

}
