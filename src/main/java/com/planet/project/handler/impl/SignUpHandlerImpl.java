package com.planet.project.handler.impl;

import com.planet.project.entity.SignUP;
import com.planet.project.handler.SignUpHandler;
import com.planet.project.mapper.SignUPMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("signUpHandler")
public class SignUpHandlerImpl implements SignUpHandler {

    @Autowired
    private SignUPMapper signUPMapper;


    @Override
    public SignUP getSignUp(String accNo) {
        SignUP signUP  = signUPMapper.selectByAccNo(accNo);
        return signUP;
    }
}
