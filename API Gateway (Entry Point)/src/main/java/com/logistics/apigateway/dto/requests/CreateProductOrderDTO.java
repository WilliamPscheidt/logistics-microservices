package com.logistics.apigateway.dto.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductOrderDTO {

    @NotEmpty(message = "The list cannot be empty")
    @Valid
    private List<OrderItemRequest> items;
}
