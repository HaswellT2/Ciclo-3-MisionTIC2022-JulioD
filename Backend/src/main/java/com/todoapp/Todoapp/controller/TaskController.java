package com.todoapp.Todoapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.Todoapp.persistence.entity.Task;
import com.todoapp.Todoapp.persistence.entity.TaskStatus;
import com.todoapp.Todoapp.service.TaskService;
import com.todoapp.Todoapp.service.dto.TaskInDTO;

@RestController
@RequestMapping ("/tasks")

public class TaskController{

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping

    public Task createTask(@RequestBody TaskInDTO taskInDTO){

        return this.taskService.createTask(taskInDTO);

    }

    @GetMapping

    public List<Task> findAll(){

        return this.taskService.findAll();

    }

    @GetMapping("/status/{status}")

    public List<Task> findAllByTaskStatus(@PathVariable("status") TaskStatus status){
        
        return this.taskService.findAllByTasksStatus(status);

    }

}
