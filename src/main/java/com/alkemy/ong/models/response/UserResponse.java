package com.alkemy.ong.models.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class UserResponse {
	
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String photo;
	
}
