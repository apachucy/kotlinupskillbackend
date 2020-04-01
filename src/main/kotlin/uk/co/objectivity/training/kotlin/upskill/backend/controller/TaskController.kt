package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Status
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task

@RestController
@RequestMapping("/tasks")
class TaskController {
    @GetMapping
    fun getAll(): List<Task> {
        return listOf(Task(1, "walk a dog", Status.TODO, 10.toBigDecimal()),
                Task(2, "wash dishes", Status.IN_PROGRESS, 5.toBigDecimal())
        )
    }
}