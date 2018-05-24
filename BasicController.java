package satyendra.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class BasicController {

    @GetMapping
    public String test(){
        return "Hi I am Spring Boot";
    }
}
