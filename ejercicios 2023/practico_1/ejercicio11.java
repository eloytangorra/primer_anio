package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese numero ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("numero multiplo de  6 y 7: " + (numero % 6 == 0 && numero % 7 == 0));
            System.out.println("numero mayor ah 30 y multiplo de dos: " + (numero > 30 && numero % 2 == 0));
            System.out.println("numero menor o igual a 30 y divisible por dos " + (numero <= 30 && numero % 2 == 0));
            System.out.println("numero dividido 5 mayor a diez " + ((numero / 5) > 10));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que permita el ingreso de un número entero
 * por teclado e imprima el resultado de determinar:
 * a. si es múltiplo de 6 y de 7,
 * b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
 * c. si el cociente de la división de dicho número por 5 es mayor
 * que 10.
 */