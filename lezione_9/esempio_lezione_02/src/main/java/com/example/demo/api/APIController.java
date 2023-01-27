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

	@RequestMapping("/api/todolist")
	public Iterable<Todo> getAllTodo(){
		List<Todo> list = new ArrayList<Todo>();
		Todo todo = new Todo(1, "andare alla riunione","11:15 al piano di sopra");
		Todo todo2 = new Todo(2, "mettere slide su google drive","dopo");
		Todo todo3 = new Todo(3, "mettere su github app","dopo");
		list.add(todo);
		list.add(todo2);
		list.add(todo3);
		return list;
	}
	
	@RequestMapping("api/todolist/{id}")
	public Todo getById(@PathVariable int id) {
		List<Todo> list = new ArrayList<Todo>();
		list.add(new Todo(1, "casa", "fare la lavatrice"));
		Optional <Todo> item = list.stream().filter(a->a.getId()==id).findFirst();
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item.get();
	}
}
