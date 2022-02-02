package requistion.application.business;


import requistion.application.RequistionApplicaiton;
import requistion.application.business.events.RequistionAdd;
import requistion.application.business.events.RequistionEvent;
import requistion.domain.Requistion;
import requistion.infrastructure.EventPublisher;
import requistion.repository.RequistionRepository;

public class StandartRequistionApplication implements RequistionApplicaiton {
    private EventPublisher eventPublisher;
    private RequistionRepository requistionRepository;

    public StandartRequistionApplication(EventPublisher eventPublisher, RequistionRepository requistionRepository) {
        this.eventPublisher = eventPublisher;
        this.requistionRepository = requistionRepository;
    }
    @Override
    public Requistion requistionAdd(Requistion requistionID) {
        return null;
    }

    @Override
    public Requistion requistionDel(Requistion requistionID) {
     return null;
    }
}
