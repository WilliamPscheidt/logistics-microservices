package com.logistics.apigateway.controller;

import com.logistics.apigateway.dto.responses.StatusResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class GatewayController {

    @RequestMapping("/status")
    public ResponseEntity<StatusResponseDTO> status() {
        return ResponseEntity.ok(new StatusResponseDTO("Service Running", "localhost"));
    }
}
