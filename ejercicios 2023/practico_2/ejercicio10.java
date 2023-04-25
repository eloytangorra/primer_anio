import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static void main(String[] args) {
        int numero = 2;
        int suma = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (numero >= 1 && numero <= 10) {

            try {

                System.out.println("Ingrese un numero entero:");
                numero = Integer.valueOf(entrada.readLine());
                if (numero >= 1 && numero <= 10) {

                    suma += numero;
                }

            }

            catch (Exception e) {
            }

        }

        System.out.println("El resultado acumulado es de: " + suma);

    }
}
/*
 * for(int i = 0; i >MAX;i++)
 * Escribir un programa que mientras que el usuario ingrese un
 * número entero entre 1 y 10 inclusive, lleve la suma de los
 * números ingresados. Finalmente, cuando sale del ciclo muestre
 * por pantalla el resultado de la suma.
 */