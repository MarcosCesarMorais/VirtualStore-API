package br.com.mcm.virtualStore.user.mapper;

import br.com.mcm.virtualStore.user.dto.UserResponse;
import br.com.mcm.virtualStore.user.entity.User;

public interface UserMapper {

    static UserResponse mapper(final User user){
        return new UserResponse(
                user.getId(),
                user.getCurrentDatePassword(),
                user.getPersonId()
        );
    }
}
