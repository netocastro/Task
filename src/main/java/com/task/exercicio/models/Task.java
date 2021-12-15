package com.task.exercicio.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public Task() {
    }

    public Task(Long id, String title, String description, String status, LocalDateTime createdDate,
            LocalDateTime updatedDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Task id(Long id) {
        setId(id);
        return this;
    }

    public Task title(String title) {
        setTitle(title);
        return this;
    }

    public Task description(String description) {
        setDescription(description);
        return this;
    }

    public Task status(String status) {
        setStatus(status);
        return this;
    }

    public Task createdDate(LocalDateTime createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Task updatedDate(LocalDateTime updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }
}
