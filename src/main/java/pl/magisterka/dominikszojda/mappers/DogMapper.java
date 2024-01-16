package pl.magisterka.dominikszojda.mappers;

import org.mapstruct.Mapper;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequest;
import pl.magisterka.dominikszojda.respons.DogResponse;

@Mapper(componentModel = "spring")
public interface DogMapper {
    DogResponse toResponse(DogEntity dogEntity);

    DogEntity toEntity(DogCreateRequest dogCreateRequest);
}
