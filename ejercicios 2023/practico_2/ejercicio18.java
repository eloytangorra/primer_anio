import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio18 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 1;
        int numero1, numero2;
        int resultado = 0;
        while (numero != 0) {

            try {

                System.out.println("ingrese un numero");
                numero = Integer.valueOf(entrada.readLine());
                if (numero != 0) {
                    System.out.println("ingrese otro numero");
                    numero1 = Integer.valueOf(entrada.readLine());
                    System.out.println("ingrese un tercer numero");
                    numero2 = Integer.valueOf(entrada.readLine());
                    if (numero2 == 0) {
                        System.out.println("no se puede dividir por cero ");
                    } else
                        resultado = numero1 / numero2;
                    System.out.print(resultado);
                }
            } catch (Exception e) {

            }
        }

    }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número distinto de 0, pida ingresar otros dos números e imprima
 * el resultado de la división entre los dos últimos números
 * ingresados. ¿Existe alguna restricción para la división?
 */