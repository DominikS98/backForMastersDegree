package pl.magisterka.dominikszojda.respons;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DogOwnerResponseDto {

    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String postalCode;
    private String country;
}
