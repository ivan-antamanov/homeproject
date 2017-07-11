package com.home.project.core;//import timeplaner.core.com.home.project.core.entities.DocumentModel;

import com.home.project.core.entities.DocumentModel;

public interface ParentDocument<T extends DocumentModel, V extends AbstractDocParent> {

    public void showSuccessDialog(); //todo put to Utils

    public V updateDocParent(T documentModel);

    public V getDocParent();

    
}
