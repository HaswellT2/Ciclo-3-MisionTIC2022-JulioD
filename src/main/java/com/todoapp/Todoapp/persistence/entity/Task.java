package com.todoapp.Todoapp.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fecha_creacion;
    private LocalDateTime fecha_finalizacion;
    private boolean Finalizada;
    private TaskStatus taskstatus;
}
