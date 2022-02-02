package requistion.application;

import requistion.domain.Requistion;

public interface RequistionApplicaiton {
    Requistion requistionAdd(Requistion requistionID);

    Requistion requistionDel(Requistion requistionID);
}
