package br.com.mcm.virtualStore.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
public record UserRequest(
        @JsonProperty("id") Long id,
        @JsonProperty("user") String user,
        @JsonProperty("password") String password,
        @JsonProperty("is_active") Boolean active
) {
}
