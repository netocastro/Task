package com.task.exercicio.resources;

import com.task.exercicio.models.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskResource extends JpaRepository<Task, Long>{
    
}
