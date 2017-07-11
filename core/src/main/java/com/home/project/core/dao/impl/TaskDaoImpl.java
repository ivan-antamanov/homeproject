package com.home.project.core.dao.impl;


import com.home.project.core.entities.subdocuments.impl.TaskDocument;
import com.home.project.core.dao.AbstractSessionFactory;
import com.home.project.core.dao.SessionFactory;

import java.util.List;

public class TaskDaoImpl extends AbstractSessionFactory<TaskDocument> {

    public TaskDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public TaskDocument create(TaskDocument document) {
        return null;
    }

    @Override
    public TaskDocument read(TaskDocument document) {
        return null;
    }

    @Override
    public TaskDocument update(TaskDocument document) {
        return null;
    }

    @Override
    public TaskDocument delete(TaskDocument document) {
        return null;
    }

    @Override
    public List<TaskDocument> findAll() {
        return null;
    }
}
