package com.home.project.core;//import timeplaner.core.com.home.project.core.entities.DocumentModel;

import com.home.project.core.entities.DocumentModel;

public abstract class AbstractProvider<C extends Controller<M>, P extends AbstractDocParent, M extends DocumentModel> implements Provider<P, M> {

    protected C controller;
    protected P parent;

//    public com.home.project.core.AbstractProvider() {
//        registrationEvents();
//    }

    protected abstract void registrationEvents();

    protected abstract void showSuccessDialog(); //todo put to Utils
}
