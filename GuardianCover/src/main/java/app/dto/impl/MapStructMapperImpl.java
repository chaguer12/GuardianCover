package app.dto.impl;

import app.dto.MapStructMapper;
import app.dto.target.UserDTO;
import app.entity.User;
import org.springframework.stereotype.Component;

@Component
public class MapStructMapperImpl implements MapStructMapper {
    @Override
    public UserDTO userToUserDTO(User user) {
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setAddress(user.getAddress());
        userDTO.setTel(userDTO.getTel());
        userDTO.setLastName(user.getLastName());
        userDTO.setFirstName(user.getFirstName());
        return userDTO;
    }
}
