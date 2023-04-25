package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static void main(String[] args) {
        int numero1, numero2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese numero 1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese numero 2");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println(numero1 > numero2);
            System.out.print("Ambos numeros son multiplo de 2: " + (numero1 % 2 == 0 && numero2 % 2 == 0));
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que permita el ingreso de dos números
 * enteros por teclado e imprima:
 * a. si el primero es mayor al segundo.
 * b. si ambos son múltiplos de 2.
 */