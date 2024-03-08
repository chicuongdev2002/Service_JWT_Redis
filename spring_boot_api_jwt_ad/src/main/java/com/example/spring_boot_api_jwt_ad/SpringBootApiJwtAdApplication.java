package com.example.spring_boot_api_jwt_ad;

import com.example.spring_boot_api_jwt_ad.authen.UserPrincipal;
import com.example.spring_boot_api_jwt_ad.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootApiJwtAdApplication {
    @Autowired
private UserServiceImpl userService;
    public static void main(String[] args) {

        SpringApplication.run(SpringBootApiJwtAdApplication.class, args);

    }
    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            UserPrincipal cuong = userService.findByUsername("cuong");
            System.out.println(cuong);

        };
    }


}
