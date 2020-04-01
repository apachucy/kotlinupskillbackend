package uk.co.objectivity.training.kotlin.upskill.backend.service

import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task

interface TaskService {
    fun getAll(): List<Task>
    fun save(task: Task): Task
}