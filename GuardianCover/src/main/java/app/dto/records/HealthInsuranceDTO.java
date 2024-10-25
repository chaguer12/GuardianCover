package app.dto.records;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record HealthInsuranceDTO(
        @NotNull
        UUID id,
        @NotNull
        double base,
        @NotNull
        String attachment,
        @NotNull
        boolean isAccepted,
        @NotNull
        UUID userId,
        @NotNull
        int age,
        @NotNull
        String healthState,
        @NotNull
        boolean isPremium)


    {
}
