package org.example;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int id;
    private String situacao = "Aberta";
    private Leitor leitor;
    private List<Livro> livros = new ArrayList<>();
    private double valorTotal = 0;

    public void adicionarLivroAoEmprestimo(Livro livro){
        livros.add(livro);
    }
    public int qtdLivrosEmprestados(){
        if(livros.size() < 1){
            throw new IllegalArgumentException("Nenhum livro adicionado ainda!");
        }
        return livros.size();
    }
    public double valorTotalEmprestimo(){
        for (Livro livro : livros){
            valorTotal += livro.getPreco();
        }
        return valorTotal;
    }
    public void fecharEmprestimo(String situacao){
        if(livros.size() < 1){
            throw new IllegalArgumentException("Nenhum livro adicionado ainda!");
        }

        if(situacao.equals("Fechado")){
            throw new IllegalArgumentException("Emprestimo ja foi fechado!");
        }

        this.situacao = "Fechado";
    }
}
