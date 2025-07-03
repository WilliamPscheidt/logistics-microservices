package com.logistics.apigateway.dto.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getters e Setters
@AllArgsConstructor // Construtor que aceita todos os campos como argumento
public class StatusResponseDTO {
        @NotBlank
        private String status;

        @NotBlank
        private String server;
}
