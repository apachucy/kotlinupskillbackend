package uk.co.objectivity.training.kotlin.upskill.backend.service

import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.model.TaskModel

interface TaskService {
    fun getAll(): List<TaskModel>
    fun save(task: TaskModel): Task
}