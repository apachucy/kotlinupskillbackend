package uk.co.objectivity.training.kotlin.upskill.backend.mapper

import ma.glasnost.orika.MapperFacade
import ma.glasnost.orika.MapperFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.mapper.converter.StatusModelToStatus
import uk.co.objectivity.training.kotlin.upskill.backend.model.TaskModel


@Service
class TaskModelToTaskMapper @Autowired constructor(val mapperFacade: MapperFacade) {
    fun map(task: Task): TaskModel {
        return mapperFacade.map(task, TaskModel::class.java)
    }

    fun map(task: TaskModel): Task {
        return mapperFacade.map(task, Task::class.java)
    }

    object Configurer {
        fun configure(mapperFactory: MapperFactory) {
            mapperFactory.converterFactory.registerConverter(StatusModelToStatus());
            mapperFactory.classMap(TaskModel::class.java, Task::class.java)
                    .byDefault()
                    .field("status", "status")
                    .register()
        }
    }

}
