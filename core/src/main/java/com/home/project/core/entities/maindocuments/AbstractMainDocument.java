package com.home.project.core.entities.maindocuments;


import com.home.project.core.entities.StubDocument;
import com.home.project.core.entities.subdocuments.AbstractSubDocument;

public abstract class AbstractMainDocument extends StubDocument {

    private AbstractSubDocument subDocument;

    public AbstractMainDocument() {
        super();
    }

    public AbstractMainDocument(String name, String description) {
        super(name, description);
        this.subDocument = subDocument;
    }

    public AbstractSubDocument getSubDocument() {
        return subDocument;
    }

    public void setSubDocument(AbstractSubDocument subDocument) {
        this.subDocument = subDocument;
    }
}
