package com.rev.revisao.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.revisao.model.Task;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    // Criar
    public Task create(Task task) {
        return repository.save(task);
    }

    // Ler todos
    public List<Task> getAll() {
        return repository.findAll();
    }

    // Ler por ID
    public Optional<Task> getById(Long id) {
        return repository.findById(id);
    }

    // Atualizar
    public Task update(Task task) {
        return repository.save(task);
    }

    // Deletar
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
