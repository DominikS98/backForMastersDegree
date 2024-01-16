package pl.magisterka.dominikszojda.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.mappers.DogMapper;
import pl.magisterka.dominikszojda.request.DogCreateRequest;
import pl.magisterka.dominikszojda.respons.DogResponse;
import pl.magisterka.dominikszojda.service.DogService;

@RequiredArgsConstructor
@RestController
@RequestMapping("dogs")
public class DogController {

    private final DogService dogService;
    private final DogMapper mapper;

    @PostMapping("")
    public ResponseEntity<DogResponse> createDog(@RequestBody DogCreateRequest dogRequest) {
        DogEntity responseEnt = dogService.createDog(mapper.toEntity(dogRequest));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mapper.toResponse(responseEnt));
    }


}
