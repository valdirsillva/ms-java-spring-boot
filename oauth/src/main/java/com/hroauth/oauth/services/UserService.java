package com.hroauth.oauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hroauth.oauth.entities.User;
import com.hroauth.oauth.feignclients.UserFeignClient;

@Service // Registra classe como um componente Service do Spring
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        // Criando comunicação com microsserviço de User
        User user = userFeignClient.findByEmail(email).getBody();

        if (user == null) {
            logger.error("Email not found: " + email);
            throw new IllegalArgumentException("Email  not found");
        }
        logger.info("Email found: " + email);
        return user;
    }
}
