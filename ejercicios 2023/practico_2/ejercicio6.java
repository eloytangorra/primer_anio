import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        final int numero1 = 1;
        final int numero2 = 100;

        try {

            while (numero < 2 || numero >= 100) {
                System.out.println("ingrese un numero menor que " + numero2 + " y mayor que :" + numero1);
                numero = Integer.valueOf(entrada.readLine());

            }

            if ((numero % 2 == 0) || (numero % 3 == 0)) {
                System.out.println(numero);
            } else
                System.out.println("el numero no es multiplo de ni de 3");

        } catch (Exception e) {

        }
    }
}
/*
 * Escribir un programa que mientras el usuario ingrese un número
 * entero menor que 100 y mayor a 1, muestre por pantalla si el
 * número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
 * valores mencionados en el enunciado deberían ser constantes?.
 * De a poco habría que definirlos como constantes).
 */
