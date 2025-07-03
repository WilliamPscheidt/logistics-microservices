package com.logistics.apigateway.controller;

import com.logistics.apigateway.dto.requests.CreateProductOrderDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class GatewayController {

    @PostMapping("/create/")
    public ResponseEntity<CreateProductOrderDTO> createProductOrder(@Valid @RequestBody CreateProductOrderDTO request) {

        return ResponseEntity.ok(request);
    }
}
