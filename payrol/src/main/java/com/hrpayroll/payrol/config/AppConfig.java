package com.hrpayroll.payrol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    /**
     * Registra uma instância única (Singleton RestTemplate)
     * 
     * @return return (Singleton RestTemplate)
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
