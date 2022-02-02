package requistion.application.business.events;

import book.domain.Book;
import requistion.domain.Requistion;

public class RequistionDel {
    private final Requistion requistion;

    public RequistionDel(Requistion requistion) {
        this.requistion = requistion;
    }

    public Requistion getRequistion() {
        return requistion;
    }
}
