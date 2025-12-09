package org.example;

public class Livro {
    private int id;
    private String nome;
    private double preco;

    public Livro(int id, double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
