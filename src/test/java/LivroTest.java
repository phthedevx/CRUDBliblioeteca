import org.example.Livro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    private Livro livro;

    @Test
    public void testarCriacaoLivro(){
        //Arrange
        //Act
        livro = new Livro(1, 5, "Clean code");
        //Assert
        Assertions.assertEquals(1, livro.getId());
        Assertions.assertEquals("Clean code", livro.getNome());
        Assertions.assertEquals(5, livro.getPreco());
    }

    @Test
    public void testarSetters() {
        livro = new Livro(1, 5, "Clean code");

        livro.setId(33);
        livro.setNome("code byte");
        livro.setPreco(10);

        assertEquals(33, livro.getId());
        assertEquals("code byte", livro.getNome());
        assertEquals(10, livro.getPreco());


    }
}
