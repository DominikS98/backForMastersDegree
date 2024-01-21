package pl.magisterka.dominikszojda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogResponseDto;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface DogMapper {
    @Mapping(target = "ownerId", ignore = true)
    @Mapping(target = "id", ignore = true)
    DogResponseDto toResponse(DogEntity dogEntity);

    @Mapping(target = "owner", ignore = true)
    @Mapping(target = "id", ignore = true)
    DogEntity toEntity(DogCreateRequestDto dto);




    List<DogResponseDto> toResponseList(List<DogEntity> dogEntity);

}
