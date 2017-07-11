package docobjets.plan;

import com.home.project.core.AbstractProvider;
import com.home.project.core.entities.maindocuments.impl.PlanDocument;
import com.home.project.core.events.EventProcessor;
import com.home.project.core.events.ProjectEventHandler;
import com.home.project.core.events.SceneFactory;
import com.home.project.core.events.events.sceneevents.ChangeChildrenVisibilityEvent;
import com.home.project.core.dao.SessionFactory;
import docobjets.plan.events.CreateProject;

import java.util.logging.Logger;

public class PlanProvider extends AbstractProvider<PlanController, PlanParent, PlanDocument> {

    private Logger logger = Logger.getLogger(PlanProvider.class.getName());

    public PlanProvider(SessionFactory localSession) {
        parent = new PlanParent(new PlanSkeleton());
        controller = new PlanController(localSession);
        registrationEvents();
    }

    @Override
    protected void registrationEvents() {
        EventProcessor.register(CreateProject.class, createProjectHandler);
    }

    private ProjectEventHandler<CreateProject> createProjectHandler = event -> {
        logger.info("Button \" Create Plan\" was pressed");
        PlanDocument planDocument = parent.getDocument();
        EventProcessor.send(new ChangeChildrenVisibilityEvent(parent.getClass(), SceneFactory.INSTANCE.get()));
    };


    @Override
    protected void showSuccessDialog() {
        throw new UnsupportedOperationException("Operation showSuccessDialog not supported yet");
    }

    @Override
    public PlanParent newNode() {
        throw new UnsupportedOperationException("Operation newNode not supported yet");
    }

    @Override
    public PlanParent updateNode(PlanDocument planDocument) {
        throw new UnsupportedOperationException("Operation updateNode not supported yet");
    }

    @Override
    public PlanParent getNode() {
        return parent.getDocParent();
    }
}
