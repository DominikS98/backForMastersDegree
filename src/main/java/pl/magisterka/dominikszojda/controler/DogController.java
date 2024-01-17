package pl.magisterka.dominikszojda.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.mappers.DogMapper;
import pl.magisterka.dominikszojda.request.DogCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogResponseDto;
import pl.magisterka.dominikszojda.service.DogService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("dogs")
public class DogController {

    private final DogService dogService;
    private final DogMapper mapper;

    @PostMapping("/add-dog")
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

}
