import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio17 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        try {
            System.out.print("ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            if ((numero > 1) && (numero < 10)) {

                for (int i = numero; i >= 0; i--) {

                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que dado un valor ingresado por el
 * usuario menor que 10 y mayor a 1, muestre por pantalla una
 * cuenta regresiva de números desde dicho valor hasta el 0
 * inclusive.
 */
