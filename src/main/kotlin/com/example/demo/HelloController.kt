package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class HelloController {

    @GetMapping("/")
    fun home() : String {
        return "this is home"
    }

    @GetMapping("/hello-world")
    fun helloWorldMapping() : String {
        return "Hello World!!"
    }

    @GetMapping("/lat-lon")
    fun getLonLat() : String {
        return "111.00 ,111.00"
    }
    //test sadfasdf

    @GetMapping("/sendy")
    fun getsendy() : String {
        return "sendy"
    }

    @GetMapping("/itshard")
    fun dohard() : String {
        return "수고했어"
    }

    @GetMapping("/myload")
    fun loadBalanced() : String {
        return "load balanced page"
    }
}