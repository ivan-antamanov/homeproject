package com.home.project.core;


import com.home.project.core.entities.DocumentModel;

public interface Provider<T extends AbstractDocParent, V extends DocumentModel> {

//    public void registrationEvents();

//    public void createDocument(DocumentModel document) throws Exception;
//
//    public DocumentModel readDocument(DocumentModel document) throws Exception;
//
//    public DocumentModel updateDocument(DocumentModel document) throws Exception;
//
//    public void deleteDocument(DocumentModel document) throws Exception;
//
//    public List<DocumentModel> getAllDocuments() throws Exception;

    public T newNode();

    public T updateNode(V documentModel);

    public T getNode();


}
