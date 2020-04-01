package uk.co.objectivity.training.kotlin.upskill.backend.entity

import java.math.BigDecimal

data class Task(val id: Int, val description: String, val status: Status, val profit: BigDecimal) {
}