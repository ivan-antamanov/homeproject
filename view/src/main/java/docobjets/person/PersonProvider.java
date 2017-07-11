package docobjets.person;

import com.home.project.core.AbstractProvider;
import com.home.project.core.entities.PersonDocument;
import com.home.project.core.dao.SessionFactory;

public class PersonProvider extends AbstractProvider<PersonController, PersonParent, PersonDocument> {

    public PersonProvider(SessionFactory sessionFactory){
        parent = new PersonParent(new PersonSkeleton());
        controller = new PersonController(sessionFactory);
    }

    @Override
    protected void registrationEvents() {

    }

    @Override
    protected void showSuccessDialog() {

    }

    @Override
    public PersonParent newNode() {
        return null;
    }

    @Override
    public PersonParent updateNode(PersonDocument documentModel) {
        return null;
    }

    @Override
    public PersonParent getNode() { //todo in abstract class
        return parent.getDocParent();
    }
}
