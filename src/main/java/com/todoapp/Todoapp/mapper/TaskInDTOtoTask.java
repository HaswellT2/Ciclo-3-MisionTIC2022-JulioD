package com.todoapp.Todoapp.mapper;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import com.todoapp.Todoapp.persistence.entity.Task;
import com.todoapp.Todoapp.persistence.entity.TaskStatus;
import com.todoapp.Todoapp.service.dto.TaskInDTO;


@Component
public class TaskInDTOtoTask implements IMapper <TaskInDTO, Task> {

    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitulo(in.getTitulo());
        task.setDescripcion(in.getDescripcion());
        task.setFecha_finalizacion(in.getFecha_finalizacion());
        task.setFecha_creacion(LocalDateTime.now());
        task.setFinalizada(false);
        task.setTaskstatus(TaskStatus.ON_TIME);
        return task;
    }
    
}
