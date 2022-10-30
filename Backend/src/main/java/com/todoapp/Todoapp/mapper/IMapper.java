package com.todoapp.Todoapp.mapper;

public interface IMapper <I, O>{
    public O map(I in);
}
