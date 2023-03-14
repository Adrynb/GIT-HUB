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
            if(Integer.parseInt(parte) > 1000){
                System.out.println("Numero superior a 1000 ignorado");
                return suma;
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