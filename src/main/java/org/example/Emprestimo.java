package org.example;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private int id;
    private String situacao = "Aberta";
    private Leitor leitor;
    private List<Livro> livros = new ArrayList<>();
    private double valorTotal = 0;

    public String getSituacao() {
        return situacao;
    }

    public Emprestimo(int id, Leitor leitor) {
        this.id = id;
        this.leitor = leitor;
    }
    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivroAoEmprestimo(Livro livro){
        livros.add(livro);
    }

    public double valorTotalEmprestimo(){
        double contagemTotal = 0;
        for (Livro livro : livros){
            contagemTotal += livro.getPreco();
        }
        valorTotal = contagemTotal;
        return valorTotal;
    }
    public void fecharEmprestimo(){
        if(livros.size() < 1){
            throw new IllegalArgumentException("Nenhum livro adicionado ainda!");
        }

        if(situacao.equals("Fechado")){
            throw new IllegalArgumentException("Emprestimo ja foi fechado!");
        }

        this.situacao = "Fechado";
    }
}
