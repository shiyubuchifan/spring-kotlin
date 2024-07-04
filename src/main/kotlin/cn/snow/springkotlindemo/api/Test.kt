package cn.snow.springkotlindemo.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/hello")
class HelloController {

    @GetMapping
    fun sayHello(): String {
        return "Hello from Spring Boot Kotlin!"
    }

    @GetMapping("/greet")
    fun greetUser(@RequestParam name: String): String {
        return "Hello, $name!"
    }
}