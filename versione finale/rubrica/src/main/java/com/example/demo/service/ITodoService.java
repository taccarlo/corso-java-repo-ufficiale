package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Todo;

public interface ITodoService {

	public Iterable<Todo> getAllTodo();

	public Optional<Todo> getById(int id);
	
	public Todo create(Todo todo);
	
	public Optional<Todo> update(int id, Todo todo);
	
	public Boolean delete(int id);

}
