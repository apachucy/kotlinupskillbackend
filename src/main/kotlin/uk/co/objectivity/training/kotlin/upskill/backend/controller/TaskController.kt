package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService

@RestController
@RequestMapping("/tasks")
class TaskController(val taskService: TaskService) {

    @GetMapping
    fun getAll(): List<Task> {
        return taskService.getAll()
    }
}