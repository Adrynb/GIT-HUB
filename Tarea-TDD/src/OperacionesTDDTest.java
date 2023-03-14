import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void TestDevuelve0(){
        OperacionesTDD operacion = new OperacionesTDD();
        String suma = operacion.calc("");

        assertEquals("0", suma);

    }

    @Test
    void TestDevuelve1(){
        OperacionesTDD operacion = new OperacionesTDD();
        String suma = operacion.calc("1");

        assertEquals("1", suma);
    }
}