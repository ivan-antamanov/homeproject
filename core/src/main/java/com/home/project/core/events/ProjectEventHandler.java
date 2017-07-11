package com.home.project.core.events;


public interface ProjectEventHandler<E> {
    void handle(E event);
}
