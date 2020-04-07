package uk.co.objectivity.training.kotlin.upskill.backend.configuration

import ma.glasnost.orika.MapperFacade
import ma.glasnost.orika.impl.DefaultMapperFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import uk.co.objectivity.training.kotlin.upskill.backend.mapper.TaskModelToTaskMapper

@Configuration
class TaskConfiguration {

    @Bean
    fun mapperFacade(): MapperFacade {
        val mapperFactory = DefaultMapperFactory.Builder().build()
        TaskModelToTaskMapper.Configurer.configure(mapperFactory)
        return mapperFactory.mapperFacade
    }

}