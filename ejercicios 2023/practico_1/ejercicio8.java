package practico_1;

public class ejercicio8 {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println("  OR false or true es:  " + (t || f));
        System.out.println("  OR false or false es:  " + (f || f));
        System.out.println("  OR true or true es:  " + (t || t));

        System.out.println(" AND false or true es:  " + (t && f));
        System.out.println(" AND false or false es:  " + (f && f));
        System.out.println(" AND true or true es:  " + (t && t));
    }
}

/*
 * Escribir un programa que imprima por pantalla la tabla de verdad
 * para los operadores lógicos or y and (por separado) para dos
 * valores booleanos. Utilizar los operadores para calcular el
 * resultado. Por ejemplo, imprimir el siguiente caso para el operador
 * or:
 * false or true es: true
 * y se genera con:
 * System.out.println(“ false or true es: ” + (false || true));
 */
// and &&
// or ||