package pl.magisterka.dominikszojda.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DogCreateRequest {

        private String name;
        private String breed;
        private int age;

        private UUID ownerId;
}
