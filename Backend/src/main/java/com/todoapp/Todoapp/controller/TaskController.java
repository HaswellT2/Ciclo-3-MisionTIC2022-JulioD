package com.todoapp.Todoapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.todoapp.Todoapp.service.TaskService;

@RestController

public class TaskController{

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

}
