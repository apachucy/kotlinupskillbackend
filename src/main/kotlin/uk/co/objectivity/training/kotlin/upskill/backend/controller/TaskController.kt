package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.*
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService

@RestController
@RequestMapping("/tasks")
class TaskController(val taskService: TaskService) {

    @GetMapping
    fun getAll(): List<Task> {
        return taskService.getAll()
    }

    @PostMapping
    fun save(@RequestBody task: Task) {
        taskService.save(task)
    }
}