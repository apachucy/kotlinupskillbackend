package uk.co.objectivity.training.kotlin.upskill.backend.model

import javax.validation.constraints.NotBlank

data class AssignedTaskPerson(@field:NotBlank(message = "assigned person should not be empty")
                              var assigned: String) {
}