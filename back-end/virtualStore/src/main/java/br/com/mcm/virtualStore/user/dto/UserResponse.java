package br.com.mcm.virtualStore.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record UserResponse(
        @JsonProperty("id") Long id,
        @JsonProperty("current_date_password") Instant currentDatePassword,
        @JsonProperty("user") String user,
        @JsonProperty("is_active") Boolean active,
        @JsonProperty("create_at") Instant createAt,
        @JsonProperty("update_at") Instant updateAt,
        @JsonProperty("create_user") Long createUser,
        @JsonProperty("update_user") Long updateUser
) {
}
