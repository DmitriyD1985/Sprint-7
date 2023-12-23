package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller {
    @GetMapping("gethellow")
    fun getRequest(): String {
        return "Hello world"
    }
}