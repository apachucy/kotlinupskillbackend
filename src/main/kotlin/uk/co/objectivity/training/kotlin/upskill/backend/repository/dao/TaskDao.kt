package uk.co.objectivity.training.kotlin.upskill.backend.repository.dao

import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task

interface TaskDao {
    fun getAll(): List<Task>
    fun save(task: Task): Task
}