package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

private final java.util.List<Task> tasks = new ArrayList<Task>();
	

public TaskController() {
	tasks.add(new Task(1L, "Learn Spring Boot IoC", true));
    tasks.add(new Task(2L, "Build REST APIs", false));
}


@GetMapping
public List<Task> getAllTasks(){
	return tasks;
}

@GetMapping("/{id}")
public ResponseEntity<Task> getTaskById(@PathVariable("id") Long id)
{
Optional<Task> task =  tasks.stream().filter(t->t.id().equals(id)).findFirst();
	
return task.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	

}

}
