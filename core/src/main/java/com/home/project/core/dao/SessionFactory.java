package com.home.project.core.dao;


import com.home.project.core.entities.DocumentModel;

import java.io.IOException;

public interface SessionFactory<T extends DocumentModel> {

    T readDocument(T document) throws IOException, ClassNotFoundException;
    T createDocument(T document) throws IOException ;

}
