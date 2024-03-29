package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Todo;
import com.example.demo.service.DBItemService;
import com.example.demo.service.ITodoService;
import com.example.demo.service.ItemService;

@RestController
public class APIController {

	@Autowired
	@Qualifier("mainTodoService")
	private ITodoService itemService;

	
	public APIController() {
		itemService = new DBItemService();
	}
	
	@RequestMapping("/api/todolist")
	public Iterable<Todo> getAllTodo(){
		return itemService.getAllTodo();
	}
	
	@RequestMapping("api/todolist/{id}")
	public Todo getById(@PathVariable int id) {
		Optional <Todo> item = itemService.getById(id);
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item.get();
	}
}
