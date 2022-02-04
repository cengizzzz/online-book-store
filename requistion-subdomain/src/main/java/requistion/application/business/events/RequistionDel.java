package requistion.application.business.events;

import book.domain.Book;
import requistion.domain.Requistion;

public class RequistionDel extends RequistionEvent{
    private final Requistion requistion;

    public RequistionDel(Requistion requistion) {
        this.requistion = requistion;
    }

    public Requistion getRequistion() {
        return requistion;
    }
}
