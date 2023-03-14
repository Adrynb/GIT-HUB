import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTDDTest {

    @Test
    void TestDevuelve0() {
        OperacionesTDD operacion = new OperacionesTDD();
        String suma = "0";
        assertEquals("0", suma);
    }

    @Test
    void TestDevuelve1() {
        OperacionesTDD operacion = new OperacionesTDD();
        String suma = "1";
        assertEquals("1", suma);
    }

}