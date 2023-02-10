package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;

@RestController
public class APIUserController {

	@Autowired
	@Qualifier("mainUserService")
	private IUserService userService;
	
	public APIUserController() {
	}
	
	@RequestMapping("/admin/api/userlist")
	public Iterable<User> getAllTodo(){
		return userService.getAllUser();
	}
	
	@RequestMapping("/admin/api/userlist/{id}")
	public User getById(@PathVariable int id) {
		Optional <User> item = userService.getById(id);
		if(item.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return item.get();
	}
	
	@RequestMapping(value = "/admin/api/userlist", method = RequestMethod.POST)
	public User update(@RequestBody User user) {
		return userService.create(user);
	}
	
	@RequestMapping(value = "/admin/api/userlist/{id}", method = RequestMethod.PUT)
	public User update(@PathVariable int id, @RequestBody User user) {

		Optional<User> foundItem = userService.update(id, user);
		if(foundItem.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		foundItem.get().setName(user.getName());
		foundItem.get().setLastname(user.getLastname());
		foundItem.get().setEmail(user.getEmail());
		foundItem.get().setCell(user.getCell());
		return foundItem.get();
	}
	
	
	@RequestMapping(value = "/admin/api/userlist/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		Boolean isDeleted = userService.delete(id);
		if(isDeleted == false) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
	}
	
}
