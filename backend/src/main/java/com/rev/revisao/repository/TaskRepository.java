package com.rev.revisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rev.revisao.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // métodos personalizados, se quiser


    // You can define custom query methods here if needed, for example:
    // Optional<Task> findByTitle(String title);


}