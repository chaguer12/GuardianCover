package app.dto.records;

import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.util.UUID;

public record ContractDTO (
    @NotNull UUID id,
    @NotNull Date createdAt,
    @NotNull UUID userId,
    @NotNull UUID insuranceId)

{
}

