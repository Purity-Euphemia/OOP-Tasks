package com.todo.controllers;

import com.todo.data.models.Todo;
import com.todo.data.repositories.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin//(origins = "http://localhost:3000")
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @GetMapping
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
}
