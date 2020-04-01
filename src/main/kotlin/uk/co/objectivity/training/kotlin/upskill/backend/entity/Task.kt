package uk.co.objectivity.training.kotlin.upskill.backend.entity

import java.math.BigDecimal
import javax.persistence.*

data class Task(val description: String,
                @Enumerated(EnumType.STRING)
                val status: Status,
                val profit: BigDecimal) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
}