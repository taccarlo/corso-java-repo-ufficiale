package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public interface ITodoRepository extends CrudRepository<Todo, Integer>{

}
