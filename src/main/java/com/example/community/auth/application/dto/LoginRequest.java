package com.example.community.auth.application.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
	@NotBlank String email,
	@NotBlank String password
) {
}
