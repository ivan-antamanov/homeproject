package com.home.project.core.events.handlers;


import com.home.project.core.events.ProjectEventHandler;
import com.home.project.core.events.events.sceneevents.ChangeChildrenVisibilityEvent;

import java.util.concurrent.atomic.AtomicReference;

public interface SceneHandlersFactory {

    AtomicReference<SceneHandlersFactory> INSTANCE = new AtomicReference<>();

    ProjectEventHandler<ChangeChildrenVisibilityEvent> getVisibilityHandler();

}
