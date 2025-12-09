package org.example;

public class Main {
    public static void main(String[] args) {
        Leitor leitor1 =  new Leitor(1, "Pedro");

        Livro livro = new Livro(1, 5, "Clean code");
        Livro livro1 = new Livro(2, 10, "Structure code");

        Emprestimo  emprestimo  = new Emprestimo(1, leitor1);

        emprestimo.adicionarLivroAoEmprestimo(livro);
        emprestimo.adicionarLivroAoEmprestimo(livro1);

        emprestimo.fecharEmprestimo();

        System.out.println(emprestimo.valorTotalEmprestimo());
        System.out.println(emprestimo.valorTotalEmprestimo());
    }
}
