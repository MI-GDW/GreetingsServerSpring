package de.thkoeln.gm.greetingsserverspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreetingsServerSpringApplication

fun main(args: Array<String>) {
    runApplication<GreetingsServerSpringApplication>(*args)
}
