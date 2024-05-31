package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepository;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoRepository toDoRepository;
	
	public List<ToDo>getAllTodos(){
		return toDoRepository.findAll();
	}
}
