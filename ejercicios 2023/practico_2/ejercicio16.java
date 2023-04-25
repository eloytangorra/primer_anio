import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        final int iteracion = 15;
        char caracter = 'b';

        int contador2 = 0;
        int contador = 0;
        for (int i = 0; i <= iteracion; i++) {
            try {
                System.out.println("ingres un caracter ");
                caracter = entrada.readLine().charAt(0);
                if (caracter == 'a') {
                    contador++;

                }
                if (caracter != 'a') {
                    contador = 0;
                }
                if (contador > contador2) {// en este if si contador es mas grande que contador2 : contador 2 pasa a
                                           // tener el valor de contador.
                    contador2 = contador;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(contador2);
    }
}
/*
 * Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
 * ‘a’ seguidas que se ingresaron.
 */
