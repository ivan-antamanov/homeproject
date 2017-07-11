package docobjets.plan;


import com.home.project.core.AbstractController;
import com.home.project.core.entities.maindocuments.impl.PlanDocument;
import com.home.project.core.dao.SessionFactory;
import com.home.project.core.dao.impl.PlanDaoImpl;

import java.util.List;

public class PlanController extends AbstractController<PlanDaoImpl, PlanDocument> {


    public PlanController(SessionFactory sessionFactory) {
        this.dao = new PlanDaoImpl(sessionFactory);
    }

    @Override
    public PlanDocument getDocument(PlanDocument document) {
        return null;
    }

    @Override
    public PlanDocument createDocument(PlanDocument document) {
        return null;
    }

    @Override
    public void deleteDocument(PlanDocument document) {

    }

    @Override
    public void updateDocument(PlanDocument document) {

    }

    @Override
    public List<PlanDocument> allDocuments() {
        return null;
    }
}
