package uk.co.objectivity.training.kotlin.upskill.backend.validation

import uk.co.objectivity.training.kotlin.upskill.backend.annotations.EnumPatternAnnotation
import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext


class EnumNameValueValidator : ConstraintValidator<EnumPatternAnnotation, Enum<*>> {
    private lateinit var pattern: Pattern

    override fun initialize(constraintPatternAnnotation: EnumPatternAnnotation?) {
        pattern = Pattern.compile(constraintPatternAnnotation?.regexp)
    }

    override fun isValid(value: Enum<*>?, context: ConstraintValidatorContext?): Boolean {
        if (value == null) {
            return true
        }
        val m: Matcher = pattern.matcher(value.name)
        return m.matches()
    }
}