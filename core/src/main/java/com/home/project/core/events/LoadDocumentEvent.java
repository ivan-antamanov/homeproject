package com.home.project.core.events;


import com.home.project.core.entities.DocumentModel;
import com.home.project.core.events.events.ProjectEvent;

public class LoadDocumentEvent<T extends DocumentModel> implements ProjectEvent {

    Long id;
    T document;

    public LoadDocumentEvent(Long id) {
        this.id = id;
    }

//    public LoadDocumentEvent(T document){
//        this.task = task;
//    }

//    public Long getId() {
//        return id;
//    }

    public T getDocument() {
        return document;
    }
}
