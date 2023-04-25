import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio20 {
    private static Object entrada;

    public static void main(String[] args) {
        int numero = 1;
        char caracter;
        int numero1, numero2, numero3;
        int numeroa, numerob;
        int resultado;

        String texto;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while ((numero != 0) && (numero > 0)) {
            try {

                System.out.println("ingrese un numero entero");
                numero = Integer.valueOf(entrada.readLine());
                System.out.print("ingrese un caracter");
                caracter = entrada.readLine().charAt(0);

                switch (caracter) {
                    case 'a':
                        System.out.println("ingrese su texto");
                        texto = entrada.readLine();
                        System.out.println(texto);
                        break;
                    case 'b':
                        System.out.println("ingrese un numero entero");
                        numero1 = Integer.valueOf(entrada.readLine());
                        System.out.println("ingrese un numero entero");
                        numero2 = Integer.valueOf(entrada.readLine());
                        System.out.println("ingrese un numero entero");
                        numero3 = Integer.valueOf(entrada.readLine());
                        if ((numero1 <= numero2) && (numero2 <= numero3)) {
                            System.out.println("numeros ingresados en orden asendentes");

                        } else {
                            System.out.println("numeros sin orden");
                        }
                        break;
                    case 'c':
                        System.out.println("ingrese un numero entero negativo");
                        numeroa = Integer.valueOf(entrada.readLine());
                        System.out.println("ingrese un numero entero negativo ");
                        numerob = Integer.valueOf(entrada.readLine());
                        if ((numeroa < 0) && (numerob < 0)) {
                            resultado = numeroa * numerob;
                            Math.sqrt(resultado);
                            System.out.println("resultado");

                        } else {
                            System.out.println("el numero es positivo");
                        }
                        break;
                    default:
                        System.out.print("ERROR ingrese nuevamente ");
                        break;
                }

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

/*
 * Pedir números enteros positivos por teclado. En cada iteración
 * el usuario puede ingresar 0 para salir del programa. Si ingresa un
 * número distinto de 0 se debe pedir el ingreso de un carácter.
 * a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
 * imprimirlo por pantalla.
 * b. Si es ‘b’ se deben pedir 5 números positivos e informar si
 * fueron ingresados en orden ascendente.
 * c. Si es ‘c’ se deben pedir dos números enteros negativos e
 * imprimir la raíz cuadrada de su multiplicación. La raíz
 * cuadrada de un número se calcula con la sentencia:
 * Math.sqrt(numero).
 * d. Ante cualquier otro carácter ingresado se debe informar un
 * error y pedir nuevamente el carácter.
 */
