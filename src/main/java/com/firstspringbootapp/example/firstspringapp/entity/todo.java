package com.firstspringbootapp.example.firstspringapp.entity;

import java.time.LocalDate;

public class todo {
    private int id;
    private String userName;
    private String description;
    private LocalDate targetdate;
    private boolean done;

    @Override
    public String toString() {
        return "todo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetdate="
                + targetdate + ", done=" + done + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public todo(int id, String userName, String description, LocalDate targetdate, boolean done) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetdate = targetdate;
        this.done = done;
    }

}
