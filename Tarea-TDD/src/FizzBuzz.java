public class FizzBuzz {


    public String Comprobar(int numero){

        String cadenadeTexto = "";

        if(numero < 0){
            return "";
        }

        if(numero % 5 == 0 && numero % 3 == 0 ){
            return cadenadeTexto = "FizzBuzz";
        }
        else if (numero % 5 == 0){
             return cadenadeTexto = "Fizz";
        }

        else if (numero % 3 == 0){
           return cadenadeTexto = "Buzz";
        }

        return cadenadeTexto;
    }


}