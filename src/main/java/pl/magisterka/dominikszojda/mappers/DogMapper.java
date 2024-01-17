package pl.magisterka.dominikszojda.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.request.DogCreateRequest;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogResponse;
import pl.magisterka.dominikszojda.respons.DogResponseDto;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface DogMapper {
    DogResponseDto toResponse(DogEntity dogEntity);

    DogEntity toEntity(DogCreateRequestDto dto);




    List<DogResponse> toResponseList(List<DogEntity> dogEntity);

}
