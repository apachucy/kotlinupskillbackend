package uk.co.objectivity.training.kotlin.upskill.backend.service.impl

import org.springframework.stereotype.Service
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.mapper.TaskModelToTaskMapper
import uk.co.objectivity.training.kotlin.upskill.backend.model.TaskModel
import uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.TaskDao
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService
import java.util.stream.Collectors

@Service
class TaskServiceImpl(val taskDao: TaskDao, val taskModelToTaskMapper: TaskModelToTaskMapper) : TaskService {
    override fun getAll(): List<TaskModel> {
        val taskList = taskDao.getAll()

        return taskList.stream()
                .map { task -> taskModelToTaskMapper.map(task) }
                .collect(Collectors.toList())
    }

    override fun save(task: TaskModel): Task {
        return taskDao.save(taskModelToTaskMapper.map(task))
    }
}