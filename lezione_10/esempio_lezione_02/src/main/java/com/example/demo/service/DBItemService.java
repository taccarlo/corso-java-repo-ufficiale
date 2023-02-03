package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;

@Service
public class DBItemService implements ITodoService{

	public DBItemService() {
	}
	
	@Override
	public Iterable<Todo> getAllTodo(){
		return new ArrayList<Todo>();
	}

	@Override
	public Optional<Todo> getById(int id) {
		return Optional.empty();
	}
	
	@Override
	public Todo create(Todo todo) {
		return null;
	}
	
	@Override
	public Optional<Todo> update(int id, Todo todo) {
		return Optional.empty();
	}
	
	@Override
	public Boolean delete(int id) {
		return false;
	}
	
}
