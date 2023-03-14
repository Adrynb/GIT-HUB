import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void TestDevuelve3(){
        OperacionesTDD operacion = new OperacionesTDD();

        int sumatotal = operacion.calc(2, 1);

        assertEquals(3, sumatotal);
    }
}