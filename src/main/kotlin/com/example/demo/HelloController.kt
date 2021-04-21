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

    @GetMapping("/lat-lon")
    fun getLonLat() : String {
        return "111.00 ,111.00"
    }

    @GetMapping("/sendy")
    fun getsendy() : String {
        return "sendy"
    }
}