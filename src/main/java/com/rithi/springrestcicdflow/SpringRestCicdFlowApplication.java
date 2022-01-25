package com.rithi.springrestcicdflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRestCicdFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestCicdFlowApplication.class, args);
    }
    @GetMapping("/message")
    public String sayMessage(){
        return "Welcome to spring rest services";
    }
}
