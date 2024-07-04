package cn.snow.springkotlindemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/love")
class YOU {
    @GetMapping
    fun sayHello(): String {
        return "Hello my sweet baby,YuJiahuan! I Love U very very very much!"
    }
}