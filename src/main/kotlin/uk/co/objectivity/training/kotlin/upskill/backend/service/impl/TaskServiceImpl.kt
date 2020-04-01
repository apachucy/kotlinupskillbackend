package uk.co.objectivity.training.kotlin.upskill.backend.service.impl

import org.springframework.stereotype.Service
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Status
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.service.TaskService

@Service
class TaskServiceImpl : TaskService {
    override fun getAll(): List<Task> {
        return listOf(Task(1, "walk a dog", Status.TODO, 10.toBigDecimal()),
                Task(2, "wash dishes", Status.IN_PROGRESS, 5.toBigDecimal()))
    }

}