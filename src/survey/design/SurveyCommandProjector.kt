package survey.design

import eventsourcing.DoubleProjector

class SurveyCommandProjector : DoubleProjector<SurveyEvent, SurveyCaptureLayoutEvent> {
    override fun first(event: SurveyEvent) {
        TODO("not implemented")
    }

    override fun second(event: SurveyCaptureLayoutEvent) {
        TODO("not implemented")
    }
}