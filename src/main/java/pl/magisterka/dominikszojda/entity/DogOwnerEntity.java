package pl.magisterka.dominikszojda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "dog_owner")
public class DogOwnerEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String country;
}
