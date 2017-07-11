package com.home.project.core.dao;


import com.home.project.core.DocumentDao;
import com.home.project.core.entities.DocumentModel;

public abstract class AbstractSessionFactory<T extends DocumentModel> implements DocumentDao<T> {

    protected SessionFactory sessionFactory;

    public AbstractSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
