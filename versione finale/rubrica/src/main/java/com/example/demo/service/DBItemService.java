package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repository.ITodoRepository;

@Service
public class DBItemService implements ITodoService{

	@Autowired
	private ITodoRepository todoRepository;
	
	
	@Override
	public Iterable<Todo> getAllTodo(){
		return todoRepository.findAll();
	}

	@Override
	public Optional<Todo> getById(int id) {
		return todoRepository.findById(id);
	}
	
	@Override
	public Todo create(Todo todo) {
		return todoRepository.save(todo);
	}
	
	@Override
	public Optional<Todo> update(int id, Todo todo) {
		Optional<Todo> foundItem = todoRepository.findById(id);
		if(foundItem.isEmpty()) {
			return Optional.empty();
		}
		foundItem.get().setSubtitle(todo.getSubtitle());;
		foundItem.get().setTitle(todo.getTitle());
		return foundItem;
	}
	
	@Override
	public Boolean delete(int id) {
		Optional<Todo> foundItem = todoRepository.findById(id);
		if(foundItem.isEmpty()) {
			return false;
		}
		todoRepository.delete(foundItem.get());
		return true;
	}
	
}
