import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char letra = ' ';
        try {
            while (letra != '*') {
                System.out.println("ingrese un caracter");
                letra = entrada.readLine().charAt(0);
                if (Character.isDigit(letra)) {
                    System.out.println("el caracter es un digito");
                } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.print("el programa ah finalizado ");
    }
}
/*
 * Escribir un programa que mientras el usuario ingresa un caracter
 * distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
 * si es carácter vocal minúscula.
 */
