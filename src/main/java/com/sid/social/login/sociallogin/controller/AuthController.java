package com.sid.social.login.sociallogin.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {



    @GetMapping("/user")
    public String getName(@AuthenticationPrincipal  OAuth2User oAuth2User){
        Map<String, Object> attributes = oAuth2User.getAttributes();
        return oAuth2User.getName();

    }
}
