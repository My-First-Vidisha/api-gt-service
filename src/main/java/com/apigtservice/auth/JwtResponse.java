package com.apigtservice.auth;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor

public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
		super();
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

}
