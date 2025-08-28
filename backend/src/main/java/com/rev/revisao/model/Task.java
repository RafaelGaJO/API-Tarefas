package com.rev.revisao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private Boolean completed = false;

    // 🔹 Construtor vazio obrigatório para JPA
    public Task() {
        // Construtor sem argumentos exigido pelo JPA para instanciar a entidade via reflexão.
    }

    // 🔹 Construtor com argumentos úteis para criação manual
    public Task(String title, String description, Boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // 🔹 Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

       /*
     * Esta classe representa a entidade Task, que será mapeada para a tabela "tasks" no banco de dados.
     * Ela contém os campos essenciais de uma tarefa: título, descrição e status de conclusão.
     * O construtor vazio é obrigatório para o JPA, enquanto o construtor com argumentos facilita a criação manual.
     * Os getters e setters permitem que outras partes da aplicação acessem e modifiquem os dados da tarefa.
     * A anotação @Entity indica que esta classe é uma entidade JPA, e @Table define o nome da tabela.
     * Os campos estão anotados com @Column para configurar detalhes como obrigatoriedade e persistência.
     */

}