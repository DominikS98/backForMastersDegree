package pl.magisterka.dominikszojda.controler;

import lombok.RequiredArgsConstructor;
import pl.magisterka.dominikszojda.entity.DogEntity;
import pl.magisterka.dominikszojda.service.DogService;

@RequiredArgsConstructor
public class DogController {

    private final DogService dogService;

    private DogEntity addDog(){
        return dogService.addDog();
    }


}
