import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main(String[] args) {
        char c = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un caracater");
            c = entrada.readLine().charAt(0);
            if (Character.isDigit(c)) {
                System.out.println("el caracter es un digito:" + c);
            } else if (Character.isLowerCase(c)) {

                switch (c) {
                    case 'a':
                        System.out.println("es vocal" + c);
                        break;
                    case 'e':
                        System.out.println("es vocal" + c);
                        break;
                    case 'i':
                        System.out.println("es vocal" + c);
                        break;
                    case 'o':
                        System.out.println("es vocal" + c);
                        break;
                    case 'u':
                        System.out.println("es vocal" + c);
                        break;

                    default:
                        System.out.println("es conconante :" + c);
                        break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * carácter dígito o carácter letra minúscula, imprima si es carácter
 * dígito o carácter letra minúscula, y si es letra minúscula imprimir si
 * es vocal o consonante.
 */