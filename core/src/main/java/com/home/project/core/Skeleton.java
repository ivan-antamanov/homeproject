package com.home.project.core;


import com.home.project.core.entities.DocumentModel;

public interface Skeleton<T extends Skeleton, V extends DocumentModel> {

    public T newSkeleton(V documentModel);

    public T updateSkeleton(V documentModel);

    public V getDocument();

}
