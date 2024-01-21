package pl.magisterka.dominikszojda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.mapper.DogMapper;
import pl.magisterka.dominikszojda.repository.DogRepository;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogResponseDto;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;
    private final DogMapper mapper;

    @Override
    public DogResponseDto createDog(DogCreateRequestDto dogCreateRequest) {

        DogEntity dogEntity = mapper.toEntity(dogCreateRequest);


        return mapper.toResponse( dogRepository.save(dogEntity));
    }

    @Override
    public List<DogEntity> getDogs() {
        return dogRepository.findAll();
    }


    @Override
    public  DogResponseDto getDogById(UUID uuid){
        return mapper.toResponse(dogRepository.findById(uuid).orElse(null));

    }

    @Override
    public DogEntity assignDogToOwner(UUID dogId, UUID ownerId) {
        return dogRepository.assignDogToOwner(dogId, ownerId);
    }

}
