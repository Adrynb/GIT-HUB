import java.nio.Buffer;
import java.util.Arrays;

public class OperacionesTDD {

    public String calc (String operando){
        if(operando.equals("")){
            return "0";
        }
        else{
            return operando;
        }
    }

    public int calc (int suma1, int suma2){
        if(suma1 < 0 || suma2 < 0){

        }
        return suma1 + suma2;

    }

}
