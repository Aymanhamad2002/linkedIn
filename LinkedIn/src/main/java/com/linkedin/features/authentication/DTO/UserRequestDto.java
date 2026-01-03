package com.linkedin.features.authentication.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
	@NotBlank(message = "Email is mandatory")
	@Email
	private String email;
	@NotBlank(message = "Password is mandatory")
	private String password;
	

}
