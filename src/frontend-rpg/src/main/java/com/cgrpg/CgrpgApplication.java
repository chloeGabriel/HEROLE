package com.cgrpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CgrpgApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgrpgApplication.class, args);
    }

}
