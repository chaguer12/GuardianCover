package app.dto;

import app.dto.target.UserDTO;
import app.entity.User;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {
    UserDTO userToUserDTO(User user);
}
