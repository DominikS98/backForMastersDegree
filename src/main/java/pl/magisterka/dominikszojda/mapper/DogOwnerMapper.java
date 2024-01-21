package pl.magisterka.dominikszojda.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogOwnerResponseDto;




@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface DogOwnerMapper {

    @Mapping(target = "id", ignore = true)
     DogOwnerResponseDto toResponse(DogOwnerEntity dogOwnerEntity);

    @Mapping(target = "id", ignore = true)
    DogOwnerEntity toEntity(DogOwnerCreateRequestDto dogOwnerRequestDto);






}
