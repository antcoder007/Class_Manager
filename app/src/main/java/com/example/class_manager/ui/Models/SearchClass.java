package com.example.class_manager.ui.Models;

public class SearchClass {
    String name;
    String description;
    String professor;

    public SearchClass() {}

    public SearchClass(String description, String name, String professor) {
        this.description = description;
        this.name = name;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
