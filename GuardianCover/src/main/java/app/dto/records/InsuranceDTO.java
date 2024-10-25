package app.dto.records;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record InsuranceDTO(
        @NotNull
        UUID id,
        @NotNull
        double base,
        @NotNull
        String attachment,
        @NotNull
        boolean isAccepted,
        @NotNull
        UUID userId)

{
}
