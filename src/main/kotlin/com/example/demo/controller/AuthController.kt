package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
internal class AuthController {
    @RequestMapping(value = "api/register", method = arrayOf(RequestMethod.POST))
    fun register(@RequestParam("username") username: String): String {


        return username
    }
}
