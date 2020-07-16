package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

	private String username;
	private String password;
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
