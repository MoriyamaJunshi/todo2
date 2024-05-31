package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/todos")
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	
	@GetMapping
	public List<ToDo> getAllTodos(){
		return toDoService.getAllTodos();
	}
	
	@PostMapping
	public ToDo addTodo(@RequestBody ToDo toDo) {
		return toDoService.addTodo(toDo);
	}
	
	@GetMapping("/{id}")
	public ToDo getTodoById(@PathVariable Long id) {
		return toDoService.getTodoById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable Long id) {
		toDoService.deleteTodo(id);
	}
}
