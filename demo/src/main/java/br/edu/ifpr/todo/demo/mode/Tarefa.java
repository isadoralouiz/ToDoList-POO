package br.edu.ifpr.todo.demo.mode;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tarefas") //só se a tabela tiver nome diferente da classe
public class Tarefa {
    @Id //se for digitar o id, usa essa
    @GeneratedValue(strategy = GenerationType.IDENTITY) //usa quando é um número aleatório que o banco vai mandar
    private int id;
    private String nome;
    @Size(max = 120)
    private String descricao;
    private Status status;
    @Enumerated(EnumType.STRING)
    private LocalDate dataCriacao;
    private LocalDate prazo;

    
    public Tarefa(int id, String nome, String descricao, Status status, LocalDate dataCriacao, LocalDate prazo) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.prazo = prazo;
    }

    public Tarefa() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public LocalDate getPrazo() {
        return prazo;
    }
    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }
}
