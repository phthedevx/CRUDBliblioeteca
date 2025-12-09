import org.example.Emprestimo;
import org.example.Leitor;
import org.example.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {
    private Livro livro;
    private Leitor leitor;
    private Emprestimo emprestimo;

    @BeforeEach
     public void setUp(){
        leitor = new Leitor(1, "Pedro");
        livro = new Livro(1, 5, "Clean code");
    }

    @Test
    public void testarAdicionarLivroAoEmprestimo(){
        //Arrange
        Emprestimo emprestimo1 = new Emprestimo(1, leitor);
        //Act
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        //Assert
        assertTrue(emprestimo1.getLivros().contains(livro));
    }

    @Test
    public void testarValorTotal(){
        //Arrange
        Emprestimo emprestimo1 = new Emprestimo(1, leitor);
        //Act
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        //Assert
        assertEquals(10, emprestimo1.valorTotalEmprestimo());
    }

    @Test
    public void testarFechamentoEmprestimo(){
        //Arrange
        Emprestimo emprestimo1 = new Emprestimo(1, leitor);
        //Act
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        emprestimo1.fecharEmprestimo();
        //Assert
        assertEquals("Fechado", emprestimo1.getSituacao());
    }

    @Test
    public void validarEmprestimoSemItem() {
        //Arrange
        Emprestimo emprestimo1 = new Emprestimo(1, leitor);
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {
            emprestimo1.fecharEmprestimo();
        });
    }

    @Test
    public void validarEmprestimoFechado() {
        // Arrange
        Emprestimo emprestimo1 = new Emprestimo(1, leitor);
        emprestimo1.adicionarLivroAoEmprestimo(livro);
        emprestimo1.adicionarLivroAoEmprestimo(livro);

        // Act
        emprestimo1.fecharEmprestimo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            emprestimo1.fecharEmprestimo();
        });
    }

}
