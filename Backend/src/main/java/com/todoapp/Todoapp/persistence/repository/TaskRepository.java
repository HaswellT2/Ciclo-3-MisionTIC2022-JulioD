package com.todoapp.Todoapp.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.Todoapp.persistence.entity.Task;
import com.todoapp.Todoapp.persistence.entity.TaskStatus;

public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findAllByTaskStatus(TaskStatus status);
    
}
