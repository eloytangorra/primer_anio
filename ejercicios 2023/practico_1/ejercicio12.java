package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {

    public static void main(String[] args) {
        int numero1, numero2;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero");
            numero1 = Integer.valueOf(entrada.readLine());
            numero1++;
            System.out.println(numero1);
            System.out.println("ingrese un numero2");
            numero2 = Integer.valueOf(entrada.readLine());
            numero2++;
            System.out.println(numero2);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que permita ingresar dos números enteros,
 * incremente el primero y decremente el segundo, para luego
 * mostrar por pantalla en ambos casos, el valor original y el
 * modificado.
 */