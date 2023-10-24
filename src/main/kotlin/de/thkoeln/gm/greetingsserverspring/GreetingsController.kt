package de.thkoeln.gm.greetingsserverspring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class GreetingsController {

    @GetMapping("/")
    @ResponseBody
    fun sayHelloWorld(): String {
        return "Hello World"
    }

    @GetMapping("/greeting")
    @ResponseBody
    fun sayHello(name: String): String {
        return "Hello ${name}"
    }
}