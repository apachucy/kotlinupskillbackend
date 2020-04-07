package uk.co.objectivity.training.kotlin.upskill.backend.model

import uk.co.objectivity.training.kotlin.upskill.backend.annotations.EnumPatternAnnotation
import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

data class TaskModel(
        @field:NotBlank(message = "description is mandatory")
        var description: String,
        //Enum needs to have a custom annotation
        @EnumPatternAnnotation(regexp = "TODO|IN_PROGRESS|IN_REVIEW|DONE")
        var status: StatusModel,
        @field:Min(value = 1, message = "profit should be positive")
        var profit: BigDecimal) {
}