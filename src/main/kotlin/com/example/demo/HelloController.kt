package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class HelloController {

    @GetMapping("/hello-world")
    fun helloWorldMapping() : String {
        return "Hello World!!"
    }
}