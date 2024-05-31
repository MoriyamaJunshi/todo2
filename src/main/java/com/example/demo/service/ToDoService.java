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
	
	public ToDo addTodo(ToDo toDo) {
		return toDoRepository.save(toDo);
	}
	
	public ToDo getTodoById(Long id) {
		return toDoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("id:" + id + "は見つかりません。"));
	}
}
