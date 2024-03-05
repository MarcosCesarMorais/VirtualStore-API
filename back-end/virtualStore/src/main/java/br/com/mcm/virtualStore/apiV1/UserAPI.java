package br.com.mcm.virtualStore.apiV1;

import br.com.mcm.virtualStore.user.dto.UserRequest;
import br.com.mcm.virtualStore.user.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "users")
@Tag(name = "User")
public interface UserAPI {

    @GetMapping(
            value = "{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(summary = "Get a user by it's identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "User was not found"),
            @ApiResponse(responseCode = "500", description = "An internal server error was generated")
    })
    UserResponse getById(@PathVariable( name = "id") Long id);

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(summary = "Create a new user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created successfully"),
            @ApiResponse(responseCode = "422", description = "A validation error was thrown"),
            @ApiResponse(responseCode = "500", description = "An internal server error was thrown"),
    })
    ResponseEntity<?> createUser(@RequestBody UserRequest request);
}
