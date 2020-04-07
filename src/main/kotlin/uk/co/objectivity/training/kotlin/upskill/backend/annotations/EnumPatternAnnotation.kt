package uk.co.objectivity.training.kotlin.upskill.backend.annotations

import uk.co.objectivity.training.kotlin.upskill.backend.validation.EnumNameValueValidator
import javax.validation.Constraint
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [EnumNameValueValidator::class])
@Target(AnnotationTarget.FIELD, AnnotationTarget.TYPE_PARAMETER,
        AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class EnumPatternAnnotation(
        val regexp: String,
        val message: String = "enum annotation",
        val groups: Array<KClass<out Any>> = [],
        val payload: Array<KClass<out Any>> = []
)