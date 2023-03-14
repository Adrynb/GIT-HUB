import java.nio.Buffer;
import java.util.Arrays;

public class OperacionesTDD {

    public static int sumarNumeros(String cadena) {
        int suma = 0;
        String[] partesArray = cadena.split(",");
        for (String parte : partesArray) {
            if (!parte.isEmpty()) {
                suma += Integer.parseInt(parte);
            } else {
                return 0;
            }
        }
        return suma;
    }
}