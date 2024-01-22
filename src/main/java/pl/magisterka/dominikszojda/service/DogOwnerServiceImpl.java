package pl.magisterka.dominikszojda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.mapper.DogOwnerMapper;
import pl.magisterka.dominikszojda.repository.DogOwnerRepository;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogOwnerResponseDto;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DogOwnerServiceImpl implements DogOwnerService {

    private final DogOwnerRepository dogOwnerRepository;
    private final DogOwnerMapper dogOwnerMapper;

    public DogOwnerResponseDto createDog(DogOwnerCreateRequestDto dto) {



        DogOwnerEntity ownerEntity = dogOwnerMapper.toEntity(dto);

        return dogOwnerMapper.toResponse(dogOwnerRepository.save(ownerEntity));

    }

    public List<DogOwnerEntity> getDogOwners(){

        return dogOwnerRepository.findAll();

    }


}
