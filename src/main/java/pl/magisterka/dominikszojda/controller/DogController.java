package pl.magisterka.dominikszojda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.mapper.DogMapper;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.response.DogResponseDto;
import pl.magisterka.dominikszojda.service.DogService;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("dogs")
public class DogController {

    private final DogService dogService;

    @PostMapping("")
    public ResponseEntity<DogResponseDto> createDog(@RequestBody DogCreateRequestDto dogRequest) {
        DogResponseDto responseEnt = dogService.createDog(dogRequest);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(responseEnt);
    }

    @GetMapping("")
    public ResponseEntity<List<DogEntity>> getDogs() {

        List<DogEntity> responseEnt = dogService.getDogs();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body( responseEnt);
    }

    @GetMapping("/{UUID}")
    public ResponseEntity<DogResponseDto> getDogs(@PathVariable UUID uuid) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body( dogService.getDogById(uuid));
    }

    @PostMapping("/{dogId}/owners/{ownerId}")
    public ResponseEntity<DogEntity> assignDogToOwner(@PathVariable UUID dogId, @PathVariable UUID ownerId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body( dogService.assignDogToOwner(dogId, ownerId));
    }

}
