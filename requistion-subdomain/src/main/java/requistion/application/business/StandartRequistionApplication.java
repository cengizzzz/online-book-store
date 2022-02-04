package requistion.application.business;


import book.application.business.events.BookAddBook;
import book.application.business.events.BookDeleBook;
import book.application.business.exception.BookNotFoundException;
import book.domain.Book;
import requistion.application.RequistionApplicaiton;
import requistion.application.business.events.RequistionAdd;
import requistion.application.business.events.RequistionDel;
import requistion.application.business.events.RequistionEvent;
import requistion.domain.Requistion;
import requistion.infrastructure.EventPublisher;
import requistion.repository.RequistionRepository;

import java.util.Optional;

public class StandartRequistionApplication implements RequistionApplicaiton {
    private EventPublisher eventPublisher;
    private RequistionRepository requistionRepository;

    public StandartRequistionApplication(EventPublisher eventPublisher, RequistionRepository requistionRepository) {
        this.eventPublisher = eventPublisher;
        this.requistionRepository = requistionRepository;
    }
    @Override
    public Requistion requistionAdd(Requistion requistionID) {
        Requistion addReq = requistionRepository.add(requistionID);
        var businessEvent = new RequistionAdd(addReq);
        eventPublisher.publishEvent(businessEvent);
        return addReq;
    }

    @Override
    public Requistion requistionDel(Requistion requistionID) {
        eventPublisher.publishEvent(new RequistionDel(requistionID));
        return requistionID;
    }
}
