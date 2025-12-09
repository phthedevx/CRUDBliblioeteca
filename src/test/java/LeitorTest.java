import org.example.Leitor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeitorTest {
    private Leitor leitor;

    @Test
    public void testarCriacaoLeitor(){
        //Arrange
        //Act
        leitor = new Leitor(1, "Pedro");
        //Assert
        Assertions.assertEquals(1, leitor.getId());
        Assertions.assertEquals("Pedro", leitor.getNome());
    }

    @Test
    public void testarSetters(){
        //Arrange
        leitor = new Leitor(1, "Pedro");
        //Act
        leitor.setId(2);
        leitor.setNome("PH");
        //Assert
        assertEquals(2, leitor.getId());
        assertEquals("PH", leitor.getNome());
    }

}
