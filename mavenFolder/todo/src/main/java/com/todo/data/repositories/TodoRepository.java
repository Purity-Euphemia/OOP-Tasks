package com.todo.data.repositories;

import com.todo.data.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository <Todo, String>{

}
