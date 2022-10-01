package com.alkemy.ong.exception.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorListResponse {
    private HttpStatus status;
    private String message;
    private List<String> errors;
}
