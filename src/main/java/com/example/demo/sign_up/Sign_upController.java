package com.example.demo.sign_up;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sign_upController {

	@GetMapping("/sign_up")
	public String getSign_up() {
		return "sign_up";
	}
}
