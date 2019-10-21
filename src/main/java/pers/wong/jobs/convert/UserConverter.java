package pers.wong.jobs.convert;

import org.springframework.beans.BeanUtils;
import pers.wong.jobs.dto.UserDTO;
import pers.wong.jobs.entity.User;

public class UserConverter {
    public static UserDTO convert(User user) {
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);
        return dto;
    }
}
