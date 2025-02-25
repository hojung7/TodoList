package edu.kh.demo.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller // Controller 역할 명시 + bean 등록
@RequestMapping("/user")
public class UserController {


	// 회원가입페이지
	@GetMapping("/signup")
	public String showSignupPage() {
		return "user/signup";
	}

}
