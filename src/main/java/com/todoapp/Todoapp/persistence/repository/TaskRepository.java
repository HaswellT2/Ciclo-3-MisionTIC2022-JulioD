package com.todoapp.Todoapp.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.Todoapp.persistence.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
