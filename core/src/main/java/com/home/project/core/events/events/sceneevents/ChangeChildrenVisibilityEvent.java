package com.home.project.core.events.events.sceneevents;


import com.home.project.core.events.events.ProjectEvent;
import javafx.scene.Scene;

public class ChangeChildrenVisibilityEvent implements ProjectEvent {

    Class clazz;
    Scene scene;

    public ChangeChildrenVisibilityEvent(Class clazz, Scene scene) {
        this.clazz = clazz;
        this.scene = scene;
    }

    public Class getClazz() {
        return clazz;
    }

    public Scene getScene() {
        return scene;
    }
}

