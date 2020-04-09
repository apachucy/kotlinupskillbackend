package uk.co.objectivity.training.kotlin.upskill.backend.controller

import org.springframework.web.bind.annotation.*
import uk.co.objectivity.training.kotlin.upskill.backend.model.AssignedTaskPerson
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

    @DeleteMapping(value = ["{taskId}"], produces = ["application/json"])
    fun delete(@PathVariable taskId: Int) {
        taskService.delete(taskId)
    }

    @PostMapping("/task")
    fun getTask(@RequestBody @Valid assignedPerson: AssignedTaskPerson) {
        /**
        destructive declaration: https://kotlinlang.org/docs/reference/multi-declarations.html
        other sample:
        for ((key, value) in map) {
        // do something with the key and the value
        }
         */

        val (assigned) = assignedPerson
        taskService.get(assigned)
    }
}