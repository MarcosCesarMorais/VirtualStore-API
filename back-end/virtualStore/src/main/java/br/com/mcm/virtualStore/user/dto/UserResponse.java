package br.com.mcm.virtualStore.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record UserResponse(
        @JsonProperty("id") Long id,
        @JsonProperty("current_date_password") Instant currentDatePassword,
        @JsonProperty("person_id") Long personId

) {
}
