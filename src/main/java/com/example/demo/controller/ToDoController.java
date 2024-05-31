package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
