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

    @Test
    void TestDevuelve3(){
        OperacionesTDD operacion = new OperacionesTDD();
        int suma = operacion.sumarNumeros("1,2");
        assertEquals(3, suma);
    }

    @Test
    void TestDevuelve4(){
        OperacionesTDD operacion = new OperacionesTDD();
        int suma = operacion.sumarNumeros("1,1,2");
        assertEquals(4, suma);
}

}