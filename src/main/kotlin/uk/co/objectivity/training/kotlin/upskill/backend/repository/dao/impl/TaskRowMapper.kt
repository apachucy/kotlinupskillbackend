package uk.co.objectivity.training.kotlin.upskill.backend.repository.dao.impl

import org.springframework.jdbc.core.RowMapper
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Status
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Task

import java.sql.ResultSet
import java.sql.SQLException

class TaskRowMapper : RowMapper<Task> {

    @Throws(SQLException::class)
    override fun mapRow(rs: ResultSet, rowNum: Int): Task? {
        val task: Task = Task(
                rs.getString("description"),
                Status.valueOf(rs.getString("status")),
                rs.getBigDecimal("profit")
        )
        return task
    }

}