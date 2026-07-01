package com.kapila.user_service.models.responseDtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppResponse<T> {
    private int status;
    private String message;
    private T data;
    private String errorMessage;
}
