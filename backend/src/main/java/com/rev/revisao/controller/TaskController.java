package com.rev.revisao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.rev.revisao.model.Task;
import com.rev.revisao.repository.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    // GET /tasks - listar todas as tarefas
    @GetMapping
    public List<Task> getAll() {
        return service.getAll();
    }

    // GET /tasks/{id} - buscar tarefa por ID
    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // POST /tasks - criar nova tarefa
    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.create(task);
    }

    // PUT /tasks/{id} - atualizar tarefa existente
    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return service.update(task);
    }

    // DELETE /tasks/{id} - deletar tarefa por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}