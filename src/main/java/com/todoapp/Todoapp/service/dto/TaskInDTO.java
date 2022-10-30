package com.todoapp.Todoapp.service.dto;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class TaskInDTO {
    
    private String titulo;
    private String descripcion;
    private LocalDateTime fecha_finalizacion;

}
