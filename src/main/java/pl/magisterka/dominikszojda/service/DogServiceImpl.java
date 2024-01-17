package pl.magisterka.dominikszojda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.mappers.DogMapper;
import pl.magisterka.dominikszojda.repository.DogRepository;
import pl.magisterka.dominikszojda.request.DogCreateRequest;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogResponse;
import pl.magisterka.dominikszojda.respons.DogResponseDto;

import java.util.List;

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

}
