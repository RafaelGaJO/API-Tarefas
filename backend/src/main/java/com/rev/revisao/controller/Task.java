package com.rev.revisao.controller;

//Importante importar para que os tipos funcionem

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private Boolean completed = false;

    // Constructors, getters e setters

    public Task(String title, String description){
        this.title = title;
        this.description = description;
        this.completed = false;
    }

       // Getter para 'title'
       public String getTitle() {
        return title;
    }

    // Setter para 'title'
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter para 'description'
    public String getDescription(){
        return description;
    }

    // Setter para 'description'
    public void setDescription(String description) {
        this.description = description;
    }
    
        // Getter para 'completed'
        public Boolean getCompleted(){
            return completed;
        }

        // Setter para 'completed'
        public void setCompleted(Boolean completed){
            this.completed = completed;
        }
}