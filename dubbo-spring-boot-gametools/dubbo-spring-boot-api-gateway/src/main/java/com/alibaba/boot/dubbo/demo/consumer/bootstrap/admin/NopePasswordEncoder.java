package com.alibaba.boot.dubbo.demo.consumer.bootstrap.admin;

import org.springframework.security.crypto.password.PasswordEncoder;

public class NopePasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return rawPassword.equals(encodedPassword);
    }
}
