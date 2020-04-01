package uk.co.objectivity.training.kotlin.upskill.backend.repository.dao

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.impl.TaskDaoImpl

@Configuration
class DaoConfig {

    @Bean
    fun getTaskDao(jdbcTemplate: JdbcTemplate):TaskDao{
        return TaskDaoImpl(jdbcTemplate)
    }
}