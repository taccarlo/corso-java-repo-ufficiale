package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Todo;

@Service("mainTodoService")
public class ItemService implements ITodoService{

	private List<Todo> list;
	private int lastId;
	public ItemService() {
		list = new ArrayList<Todo>();
		Todo todo = new Todo(1, "andare alla riunione","11:15 al piano di sopra");
		Todo todo2 = new Todo(2, "mettere slide su google drive","dopo");
		Todo todo3 = new Todo(3, "mettere su github app","dopo");
		list.add(todo);
		list.add(todo2);
		list.add(todo3);
		lastId=3;
	}
	
	@Override
	public Iterable<Todo> getAllTodo(){
		return list;
	}

	@Override
	public Optional<Todo> getById(int id) {
		Optional <Todo> item = list.stream().filter(a->a.getId()==id).findFirst();
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item;
	}
	
	@Override
	public Todo create(Todo todo) {
		lastId++;
		todo.setId(lastId);
		list.add(todo);
		return todo;
	}
	
	@Override
	public Optional<Todo> update(int id, Todo todo) {
		Optional<Todo> foundTodo = list.stream().filter(a->a.getId()==id).findFirst();
		if(foundTodo.isEmpty()) {
			return Optional.empty();
		}
		foundTodo.get().setTitle(todo.getTitle());
		foundTodo.get().setSubtitle(todo.getSubtitle());
		return foundTodo;
		
	}
	
	@Override
	public Boolean delete(int id) {
		Optional<Todo> foundTodo = list.stream().filter(a->a.getId()==id).findFirst();
		if(foundTodo.isEmpty()) {
				return false;
		}
		list.remove(foundTodo.get());
		return true;
	}
	
}
