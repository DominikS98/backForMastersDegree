package pl.magisterka.dominikszojda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.magisterka.dominikszojda.entity.DogOwnerEntity;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogOwnerResponseDto;
import pl.magisterka.dominikszojda.service.DogOwnerService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("dog-owners")
public class DogOwnerController {

    private final DogOwnerService dogOwnerService;

    @PostMapping("")
    public DogOwnerResponseDto createDogOwner(@RequestBody DogOwnerCreateRequestDto dto) {
        return dogOwnerService.createDog(dto);
    }
    @GetMapping("")
    public List<DogOwnerEntity> getDogOwners() {
        return dogOwnerService.getDogOwners();
    }
}
