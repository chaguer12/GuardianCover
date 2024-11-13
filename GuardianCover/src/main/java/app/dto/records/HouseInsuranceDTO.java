package app.dto.records;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record HouseInsuranceDTO(
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
        double price,
        @NotNull
        String houseType,
        @NotNull
        String location,
        @NotNull
        String security)
{
}

