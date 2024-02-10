package com.apigtservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.apigtservice.to.ResponseTo;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GatewayController {

	@Autowired
	private WebClient webClient;
	
	@Value("${base.url.first}")
	private String baseUrlFirst;

	@Value("${base.url.second}")
	private String baseUrlSecond;
	
	@GetMapping("/first")
	public ResponseEntity<ResponseTo> getFirstMsg() {
//jhgsa
		Mono<String> mono = webClient.get().uri(baseUrlFirst+"/first").retrieve().bodyToMono(String.class);

		ResponseTo to = new ResponseTo();
		to.setMsg(mono.block());
		return new ResponseEntity<ResponseTo>(to, HttpStatus.OK);
	}

	@GetMapping("/second")
	public ResponseEntity<ResponseTo> getSecondMsg() {

		Mono<String> mono = webClient.get().uri(baseUrlSecond+"/second").retrieve().bodyToMono(String.class);

		ResponseTo to = new ResponseTo();
		to.setMsg(mono.block());
		return new ResponseEntity<ResponseTo>(to, HttpStatus.OK);
	}

	@GetMapping("/firstsecond")
	public ResponseEntity<ResponseTo> getFirstSecondMsg() {

		Mono<String> mono = webClient.get().uri(baseUrlFirst+"/first/call").retrieve().bodyToMono(String.class);

		ResponseTo to = new ResponseTo();
		to.setMsg(mono.block());
		return new ResponseEntity<ResponseTo>(to, HttpStatus.OK);
	}
}
