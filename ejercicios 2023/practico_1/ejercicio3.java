
package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
    public static void main(String[] args) {
        final int edad = 20;
        int clase;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un valor para la clase selecioonada ");
            clase = Integer.valueOf(entrada.readLine());
            System.out
                    .println("el numero de clase es este : " + clase + "y el numero de de la constante es este" + edad);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que declare una constante de tipo int y pida el
 * ingreso de un valor por teclado. Luego muestre el valor ingresado.
 * ¿Qué pasa en este caso? ¿Se puede o surge algún problema?
 */