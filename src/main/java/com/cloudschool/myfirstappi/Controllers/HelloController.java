package com.cloudschool.myfirstappi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Controller
public class HelloController {
    @GetMapping("/api/hello")
    public String sayHello() {
        return "hello";
    }
}
