package com.todoapp.Todoapp.service;

import org.springframework.stereotype.Service;

import com.todoapp.Todoapp.mapper.TaskInDTOtoTask;
import com.todoapp.Todoapp.persistence.entity.Task;
import com.todoapp.Todoapp.persistence.repository.TaskRepository;
import com.todoapp.Todoapp.service.dto.TaskInDTO;

@Service

public class TaskService {
    
    private final TaskRepository repository;
    private final TaskInDTOtoTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOtoTask mapper){
        this.repository=repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }
}
