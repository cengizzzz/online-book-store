package requistion.repository;

import requistion.domain.Requistion;

public interface RequistionRepository {

    Requistion del(Requistion requistionID);

    Requistion add(Requistion requistionID);
}
