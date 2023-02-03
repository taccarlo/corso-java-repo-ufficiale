package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Todo;

@RestController
public class APIController {

	List<Todo> list;

	
	public APIController() {
		list = new ArrayList<Todo>();
	}
	
	@RequestMapping("/api/todolist")
	public Iterable<Todo> getAllTodo(){
		return list;
	}
	
	@RequestMapping("api/todolist/{id}")
	public Todo getById(@PathVariable int id) {
		Optional <Todo> item = list.stream().filter(a->a.getId()==id).findFirst();
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item.get();
	}
}
