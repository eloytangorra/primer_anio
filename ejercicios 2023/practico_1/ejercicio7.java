package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        int resultado;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese numero1");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese numero2");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese numero3");
            numero3 = Integer.valueOf(entrada.readLine());
            resultado = (numero1 / numero2) - numero3;
            System.out.print("el resultado es :" + resultado);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que dado tres números reales ingresados
 * por el usuario, divida el primero por el segundo y al resultado
 * obtenido le reste el tercero. Muestre por pantalla el resultado
 * obtenido. Puede o no usar variables auxiliares para los cálculos.
 * Tenga en cuenta posibles errores en las operaciones.
 */