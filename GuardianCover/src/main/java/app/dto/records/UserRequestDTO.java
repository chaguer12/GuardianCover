package app.dto.records;

import app.entity.Insurance;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record UserRequestDTO(
    @NotNull
    UUID id,
    @NotNull
    String firstName,
    @NotNull
    String lastName,
    @NotNull
    String email,
    @NotNull
    String tel,
    @NotNull
    String password,
    @NotNull
    String address,
    @NotNull
    List<Insurance> insurances)
{
}
