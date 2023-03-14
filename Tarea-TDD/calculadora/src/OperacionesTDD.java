import java.nio.Buffer;
import java.util.Arrays;

public class OperacionesTDD {

    public static int sumarNumeros(String cadena) {
        int suma = 0;
        String[] partesArray = cadena.split(",");
        for (String parte : partesArray) {
            if(Integer.parseInt(parte) < 0){
                System.out.println("Numero no permitido");
                return -1;
            }
            if (!parte.isEmpty()) {
                suma += Integer.parseInt(parte);
            } else {
                return 0;
            }
        }
        return suma;
    }
}