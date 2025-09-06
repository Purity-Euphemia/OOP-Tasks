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
