package uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.impl

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.support.GeneratedKeyHolder
import org.springframework.jdbc.support.KeyHolder
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task
import uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.TaskDao
import java.sql.Connection
import java.sql.Statement.RETURN_GENERATED_KEYS


class TaskDaoImpl(val jdbcTemplate: JdbcTemplate) : TaskDao {
    override fun getAll(): List<Task> {
        return jdbcTemplate.query("SELECT * FROM TASK", TaskRowMapper())
    }

    override fun save(task: Task): Task {
        val holder: KeyHolder = GeneratedKeyHolder()
        jdbcTemplate.update({ connection: Connection ->
            val ps = connection.prepareStatement(
                    "INSERT INTO TASK (description, status, profit) values (?, ?, ?)",
                    RETURN_GENERATED_KEYS)
            ps.setString(1, task.description)
            ps.setString(2, task.status.name)
            ps.setBigDecimal(3, task.profit)
            ps
        }, holder)
        //KEY SHOULD NOT BE NULL
        task.id = holder.key!!.toInt()
        return task

    }

    override fun delete(taskId: Int) {
        TODO("Not yet implemented")
    }
}