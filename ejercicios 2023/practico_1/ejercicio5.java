package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main(String[] args) {
        int edad;
        String nombre;
        float altura;
        String ocupacion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su edad");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese su nombre");
            nombre = entrada.readLine();
            System.out.println("ingrese su altura");
            altura = Float.valueOf(entrada.readLine());
            System.out.println("ingrese su ocupacion");
            ocupacion = entrada.readLine();
            System.out.println(+edad + nombre + altura + ocupacion);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que solicite nombre, edad, altura y ocupación, y
 * los imprima por pantalla.
 */