package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Todo;
import com.example.demo.service.ItemService;

@RestController
public class AdminAPIController {

	private ItemService itemService;
	
	public AdminAPIController() {
		itemService = new ItemService();
	}
	
	@RequestMapping("/admin/api/todolist")
	public Iterable<Todo> getAllTodo(){
		return itemService.getAllTodo();
	}
	
	@RequestMapping("/admin/api/todolist/{id}")
	public Todo getById(@PathVariable int id) {
		Optional <Todo> item = itemService.getById(id);
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item.get();
	}
	
	@RequestMapping(value = "/admin/api/todolist", method = RequestMethod.POST)
	public Todo update(@RequestBody Todo todo) {
		return itemService.create(todo);
	}
	
	@RequestMapping(value = "/admin/api/todolist/{id}", method = RequestMethod.PUT)
	public Todo update(@PathVariable int id, @RequestBody Todo todo) {

		Optional<Todo> foundTodo = itemService.update(id, todo);
		if(foundTodo.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		foundTodo.get().setTitle(todo.getTitle());
		foundTodo.get().setSubtitle(todo.getSubtitle());
		return foundTodo.get();
	}
	
	
	@RequestMapping(value = "/admin/api/todolist/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		Boolean isDeleted = itemService.delete(id);
		if(isDeleted == false) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
	}
	
}
