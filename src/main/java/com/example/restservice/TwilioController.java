package com.example.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwilioController {

	//@GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting method
	@GetMapping("/turn")
	public TwilioHandler greeting() {
		TwilioHandler handler = new TwilioHandler();
		handler.doIceServerRetrieve();
		return handler;
	}
}