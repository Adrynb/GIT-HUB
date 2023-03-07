import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testSum(){
        FizzBuzz f = new FizzBuzz();
        f.Sumar(10, 20);
        assertEquals(30, f.getNumeroTotal());
        System.out.println("Jaja se subio pendejos");

    }
}