package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class SimpleController {

    @GetMapping
    fun greeting(): String {
        return "Hello Kotlin upskill!"
    }
}