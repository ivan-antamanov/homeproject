package com.home.project.core;


import com.home.project.core.entities.DocumentModel;

public abstract class AbstractController<T extends DocumentDao, V extends DocumentModel> implements Controller<V> {

    protected T dao;

}
