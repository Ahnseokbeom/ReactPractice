package com.test.board.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.board.dto.ResponseDto;
import com.test.board.dto.SignUpDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@PostMapping("/signUp")
	public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody){
		System.out.println(requestBody.toString());
		return null;
	}
}
