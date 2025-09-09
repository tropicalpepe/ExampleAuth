package com.tropicalpepe.exampleauth.dto;

import jakarta.validation.constraints.Size;

public record LoginRequest(@Size(min = 4) String username, @Size(min = 5) String password) {}
