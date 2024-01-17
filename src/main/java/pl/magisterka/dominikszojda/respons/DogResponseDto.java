package pl.magisterka.dominikszojda.respons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DogResponseDto {
        private UUID id;
        private String name;
        private String breed;
        private int age;

        private  UUID ownerId;
}
