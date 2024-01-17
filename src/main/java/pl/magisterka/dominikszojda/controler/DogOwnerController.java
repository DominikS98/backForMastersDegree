package pl.magisterka.dominikszojda.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.magisterka.dominikszojda.request.DogOwnerCreateRequestDto;
import pl.magisterka.dominikszojda.respons.DogOwnerResponseDto;
import pl.magisterka.dominikszojda.service.DogOwnerService;

@RequiredArgsConstructor
@RestController
@RequestMapping("dogOwners")
public class DogOwnerController {

    private final DogOwnerService dogOwnerService;

    @PostMapping("/add-dogOwner")
    public DogOwnerResponseDto createDog(@RequestBody DogOwnerCreateRequestDto dto) {
        return dogOwnerService.createDog(dto);
    }
}
