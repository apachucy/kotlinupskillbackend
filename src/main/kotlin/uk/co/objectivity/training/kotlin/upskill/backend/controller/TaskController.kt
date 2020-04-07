package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.*
import uk.co.objectivity.training.kotlin.upskill.backend.model.TaskModel
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService
import javax.validation.Valid

@RestController
@RequestMapping("/tasks")
class TaskController(val taskService: TaskService) {

    @GetMapping
    fun getAll(): List<TaskModel> {
        return taskService.getAll()
    }

    @PostMapping
    fun save(@RequestBody @Valid task: TaskModel) {
        taskService.save(task)
    }
}