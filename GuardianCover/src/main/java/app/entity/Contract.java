package app.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

}
