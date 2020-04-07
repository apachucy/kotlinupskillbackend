package uk.co.objectivity.training.kotlin.upskill.backend.mapper.converter

import ma.glasnost.orika.MappingContext
import ma.glasnost.orika.converter.BidirectionalConverter
import ma.glasnost.orika.metadata.Type
import uk.co.objectivity.training.kotlin.upskill.backend.entity.Status
import uk.co.objectivity.training.kotlin.upskill.backend.model.StatusModel

class StatusModelToStatus : BidirectionalConverter<StatusModel, Status>() {
    override fun convertFrom(source: Status?, destinationType: Type<StatusModel>?, mappingContext: MappingContext?): StatusModel {
        return when (source) {
            Status.IN_PROGRESS -> StatusModel.IN_PROGRESS
            Status.DONE -> StatusModel.DONE
            Status.TODO -> StatusModel.TODO
            null -> StatusModel.IN_REVIEW
        }
    }

    override fun convertTo(source: StatusModel?, destinationType: Type<Status>?, mappingContext: MappingContext?): Status {
        return when (source) {
            null, StatusModel.TODO -> Status.TODO
            StatusModel.IN_REVIEW, StatusModel.IN_PROGRESS -> Status.IN_PROGRESS
            StatusModel.DONE -> Status.DONE
        }
    }
}