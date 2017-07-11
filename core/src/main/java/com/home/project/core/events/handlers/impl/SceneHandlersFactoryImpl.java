package com.home.project.core.events.handlers.impl;


import com.home.project.core.ParentDocument;
import com.home.project.core.events.ProjectEventHandler;
import com.home.project.core.events.events.sceneevents.ChangeChildrenVisibilityEvent;
import com.home.project.core.events.handlers.SceneHandlersFactory;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
//import timeplaner.core.com.home.project.core.ParentDocument;
//import timeplaner.core.com.home.project.core.events.ProjectEventHandler;
//import timeplaner.core.com.home.project.core.events.com.home.project.core.events.sceneevents.ChangeChildrenVisibilityEvent;
//import timeplaner.core.com.home.project.core.events.handlers.SceneHandlersFactory;

import java.util.List;
import java.util.stream.Collectors;

public class SceneHandlersFactoryImpl implements SceneHandlersFactory {
    @Override
    public ProjectEventHandler<ChangeChildrenVisibilityEvent> getVisibilityHandler() {
        return event -> {
            Pane rootPane = ((Pane) event.getScene().getRoot());

            setAllDocsInvisible(rootPane);
            setVisibleForConcreteDocByClass(rootPane, event);
        };
    }

    private void setAllDocsInvisible(Pane rootPane) {
        List<Node> documents = rootPane.getChildren().stream()
                .filter(parent -> parent instanceof ParentDocument)
                .collect(Collectors.toList());
        for (Node document : documents) {
            document.setVisible(false);
            document.managedProperty().bind(document.visibleProperty());
        }
    }

    private void setVisibleForConcreteDocByClass(Pane rootPane, ChangeChildrenVisibilityEvent event) {
        List<Node> documents = rootPane.getChildren().stream()
                .filter(parent -> parent.getClass().equals(event.getClazz()))
                .collect(Collectors.toList());
        for (Node document : documents) {  //todo check if document only one
            document.setVisible(true);
            document.managedProperty().bind(document.visibleProperty());
        }
    }

}
