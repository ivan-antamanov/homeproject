package com.home.project.core.entities.maindocuments;


import com.home.project.core.entities.subdocuments.AbstractSchedule;

import java.util.List;


public abstract class AbstractDairy extends AbstractMainDocument {

    public List<AbstractSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<AbstractSchedule> schedules) {
        this.schedules = schedules;
    }

    private List<AbstractSchedule> schedules;

}
