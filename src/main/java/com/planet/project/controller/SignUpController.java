package com.planet.project.controller;

import com.planet.project.entity.SignUP;
import com.planet.project.handler.SignUpHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sign")
public class SignUpController {

    @Autowired
    private SignUpHandler signUpHandler;


    @RequestMapping("select")
    public String getSignUp(@RequestParam String accNo){
        SignUP signUP  = signUpHandler.getSignUp(accNo);
        return signUP.getAccName();
    }

}
