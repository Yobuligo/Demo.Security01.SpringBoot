package com.yobuligo.DemoSecurity01;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	@PreAuthorize("hasRole('SuperAdmin')")
	public String sendGreetings() {
		return "Hallo zusammen";
	}

}
