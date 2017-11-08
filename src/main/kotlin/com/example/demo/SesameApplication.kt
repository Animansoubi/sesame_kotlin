package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SesameApplication

fun main(args: Array<String>) {
    SpringApplication.run(SesameApplication::class.java, *args)
    println("Server up and run")
}