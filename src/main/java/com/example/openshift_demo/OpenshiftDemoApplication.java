package com.example.openshift_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftDemoApplication {

    @GetMapping("/")
    public String welcome()
    {
        return "Hi shareef..so this is openshift";
    }
    @GetMapping("/{input}")
    public String congrats(@PathVariable String input)
    {
        return "hi "+input+" openshift is really cool";
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftDemoApplication.class, args);
    }


}
