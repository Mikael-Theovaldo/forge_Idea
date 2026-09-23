package com.forgeidea.api.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ideia")
public class Ideia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    public Ideia() {
        this.dataCriacao = LocalDateTime.now(); // Define a data atual automaticamente ao criar
    }

    public Ideia(String titulo, String descricao, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.dataCriacao = LocalDateTime.now(); // Define a data atual automaticamente ao criar
    }
    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public String getTitulo() {
        return titulo; }

    public void setTitulo(String titulo) {
        this.titulo = titulo; }

    public String getDescricao() {
        return descricao; }

    public void setDescricao(String descricao) {
        this.descricao = descricao; }

    public LocalDateTime getDataCriacao() {
        return dataCriacao; }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao; }

    public Usuario getUsuario() {
        return usuario; }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; }
}
