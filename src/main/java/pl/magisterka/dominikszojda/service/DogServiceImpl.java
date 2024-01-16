package pl.magisterka.dominikszojda.service;

import pl.magisterka.dominikszojda.entity.DogEntity;

public class DogServiceImpl implements DogService {
    @Override
    public DogEntity addDog() {
        return  new DogEntity(
                null,
                "Reksio",
                "Owczarek Niemiecki",
                5
        );
    }


}
