package pl.magisterka.dominikszojda.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogOwnerResponseDto;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface DogOwnerMapper {

    DogOwnerResponseDto toResponse(DogOwnerEntity dogOwnerEntity);

    DogOwnerEntity toEntity(DogOwnerCreateRequestDto dogOwnerRequestDto);
}
