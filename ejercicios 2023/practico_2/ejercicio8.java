import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio8 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 9;
        int numero2 = 0;

        System.out.println("ingrese un numero entero");
        numero = Integer.valueOf(entrada.readLine());
        while (numero != 0) {
            try {
                System.out.println("ingrese otro numero entero");
                numero2 = Integer.valueOf(entrada.readLine());
                if (numero2 != 0) {
                    System.out.print(numero2);

                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}

/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número entero distinto de 0, pida ingresar otro número entero y lo
 * imprima.
 */