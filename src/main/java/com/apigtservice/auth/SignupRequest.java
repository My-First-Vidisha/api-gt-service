package com.apigtservice.auth;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class SignupRequest {

	private String username;
	private String password;
	private String email; 
	private Set<String> role;
	
	
}
