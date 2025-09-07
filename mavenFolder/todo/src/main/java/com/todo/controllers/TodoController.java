package com.todo.controllers;

import com.todo.data.models.Todo;
import com.todo.data.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @GetMapping
    public String getTodos(Model model){
     model.addAttribute("todos", todoRepository.findAll());
     return "todos";
    }
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }
    @PutMapping
    public Todo updateTodo(@PathVariable String id, @RequestBody Todo updated){
        return todoRepository.findById(id).map(todo -> {
            todo.setTitle(updated.getTitle());
            todo.setCompleted(updated.isCompleted());
            return todoRepository.save(todo);
        }).orElseGet(null);
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id){
        todoRepository.deleteById(id);
    }
}
