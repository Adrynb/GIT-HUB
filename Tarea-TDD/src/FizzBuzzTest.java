import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizz(){
        FizzBuzz n = new FizzBuzz();
        String resultado = n.Comprobar(15);
        assertEquals("FizzBuzz", resultado );
    }

    void testFizzSiEsDivisiblePor5(){
        FizzBuzz n = new FizzBuzz();
        String resultado = n.Comprobar(5);
        assertEquals("Fizz", resultado );
    }

    void testFizzSiEsDivisiblePor3(){
        FizzBuzz n = new FizzBuzz();
        String resultado = n.Comprobar(3);
        assertEquals("Buzz", resultado );
    }


    @Test
    void testFizzSiEsNegativo(){
        FizzBuzz n = new FizzBuzz();
        String resultado = n.Comprobar(-15);
        assertEquals("", resultado );
    }
}