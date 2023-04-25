package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main(String[] args) {
        int numero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("el resultado de la division es " + numero / 2);
            System.out.println("el resultado de la division es " + numero / 3);
            System.out.println("el resultado de la division es " + numero / 4);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el cociente de la división de dicho número
 * por 2, 3, y 4. En base a los resultados obtenidos analice cada
 * caso si es correcto o no.
 */