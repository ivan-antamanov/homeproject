package com.home.project.core.dao.impl;


import com.home.project.core.entities.PersonDocument;
import com.home.project.core.dao.AbstractSessionFactory;
import com.home.project.core.dao.SessionFactory;

import java.util.List;

public class PersonDaoImpl extends AbstractSessionFactory<PersonDocument> {

    public PersonDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public PersonDocument create(PersonDocument document) {
        return null;
    }

    @Override
    public PersonDocument read(PersonDocument document) {
        return null;
    }

    @Override
    public PersonDocument update(PersonDocument document) {
        return null;
    }

    @Override
    public PersonDocument delete(PersonDocument document) {
        return null;
    }

    @Override
    public List<PersonDocument> findAll() {
        return null;
    }
}
