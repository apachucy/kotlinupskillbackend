package uk.co.objectivity.training.kotlin.upskill.backend.service.impl

import org.springframework.stereotype.Service
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.TaskDao
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService

@Service
class TaskServiceImpl(val taskDao: TaskDao) : TaskService {
    override fun getAll(): List<Task> {
        return taskDao.getAll()
    }

    override fun save(task: Task):Task {
        return taskDao.save(task)
    }

}