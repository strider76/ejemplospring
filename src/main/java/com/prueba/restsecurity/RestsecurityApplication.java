package com.prueba.restsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(dateTimeProviderRef = "")
@EnableCaching
public class RestsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestsecurityApplication.class, args);
    }

}
