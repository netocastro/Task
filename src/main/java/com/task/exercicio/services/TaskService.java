package com.task.exercicio.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.task.exercicio.models.Task;
import com.task.exercicio.resources.TaskResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/task")

public class TaskService {

    @Autowired
    TaskResource taskResource;
    
    @GetMapping()
    public List<Task> getAllTasks() {
        return taskResource.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable Long id) {
        return taskResource.findById(id);
    }

    @PostMapping()
    public String insertTask(@RequestBody Task task){

        LocalDateTime now = LocalDateTime.now();

        task.setCreatedDate(now);
        task.setUpdatedDate(now);
        taskResource.save(task);

        return "Inserido!";
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable Long id, @RequestBody Task task){

        Optional<Task> task2 = taskResource.findById(id);
        LocalDateTime now = LocalDateTime.now();

        task2.get().setTitle(task.getTitle());
        task2.get().setDescription(task.getDescription());
        task2.get().setStatus(task.getStatus());
        task2.get().setUpdatedDate(now);

        taskResource.save(task2.get());

        return "Atualizado!";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        taskResource.deleteById(id);

        return "Apagado!";
    }
    
}
