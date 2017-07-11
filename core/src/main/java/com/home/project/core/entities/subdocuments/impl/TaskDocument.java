package com.home.project.core.entities.subdocuments.impl;


import com.home.project.core.entities.subdocuments.AbstractAction;

public class TaskDocument extends AbstractAction {

    public TaskDocument() {
        super();
    }

    public TaskDocument(Long id) {
        super(id);
    }

    public TaskDocument(String name, String description) {
        super(name, description);
    }

}
