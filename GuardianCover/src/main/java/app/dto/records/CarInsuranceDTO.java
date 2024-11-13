package app.dto.records;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CarInsuranceDTO(
    @NotNull UUID id,
    @NotNull double base,
    @NotNull String attachment,
    @NotNull boolean isAccepted,
    @NotNull UUID userId,
    @NotNull int age,
    @NotNull String carType,
    @NotNull boolean isPro,
    @NotNull String carDescription,
    @NotNull double price)


{
}

