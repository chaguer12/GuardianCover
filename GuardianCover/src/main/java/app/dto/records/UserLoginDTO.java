package app.dto.records;

import jakarta.validation.constraints.NotNull;

public record UserLoginDTO(
        @NotNull String email,
        @NotNull String password) {
}
