package com.kapila.user_service.controllers;

import com.kapila.user_service.models.responseDtos.AppResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public ResponseEntity<AppResponse<String>> ping() {
        try {
            AppResponse<String> response = AppResponse.<String>builder()
                    .status(200)
                    .message("User Service is up and running!")
                    .data("Pong")
                    .build();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(AppResponse.<String>builder()
                    .status(500)
                    .message("An error occurred while processing the request.")
                    .errorMessage(e.getMessage())
                    .build());
        }
    }
}
