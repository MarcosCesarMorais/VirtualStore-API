package br.com.mcm.virtualStore.apiV1.controllers;

import br.com.mcm.virtualStore.apiV1.UserAPI;
import br.com.mcm.virtualStore.user.dto.UserRequest;
import br.com.mcm.virtualStore.user.dto.UserResponse;
import br.com.mcm.virtualStore.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserAPI {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @Override
    public UserResponse getById(final Long id) {
        return userService.getById(id);
    }

    @Override
    public ResponseEntity<?> createUser(final UserRequest userRequest) {
        var userSave = userService.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userSave);
    }
}
