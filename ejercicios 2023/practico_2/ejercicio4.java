import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4 {

    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            if ((numero >= 0) && (numero <= 999)) {

                if ((numero >= 0) && (numero < 10)) {
                    System.out.println("tiene un digito");
                } else if ((numero >= 10) && (numero < 99)) {
                    System.out.println("tiene dos digito");
                }
                if (numero >= 100) {
                    System.out.println("tiene tres digito" + numero);
                }
            }
        }

        catch (

        Exception e) {
            System.out.println("error vuelva a iniciar el programa ");
        }

    }
}
/*
 * Escribir un programa donde el usuario ingrese un número entre 0
 * y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
 * tiene 3 dígitos debe informar qué número es.
 */