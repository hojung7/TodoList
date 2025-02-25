package edu.kh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.kh.demo.dto.EmailAuthResponseDto;
import edu.kh.demo.service.EmailService;
import edu.kh.demo.service.RedisUtil;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/email")
public class EmailController {

    private final EmailService emailService;
    private final RedisUtil redisUtil;

    // 인증번호 전송
    @PostMapping("/send")
    public EmailAuthResponseDto sendAuthCode(@RequestParam String address) {
        return emailService.sendEmail(address);
    }

    // 인증번호 검증
    @GetMapping("/verify")
    public EmailAuthResponseDto checkAuthCode(@RequestParam String address, @RequestParam String authCode) {
        return emailService.validateAuthCode(address, authCode);
    }
}