import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int hora, temperatura;
        char palabra;
        int cantvocales, cantconconantes;
        try {

            System.out.println("ingrese un numero entre 00hs y 24hs");
            hora = Integer.valueOf(entrada.readLine());
            // parte A del ejercicio
            if ((hora >= 0) && (hora <= 5)) {
                System.out.println("ingrese la temperatura ");
                temperatura = Integer.valueOf(entrada.readLine());
                if (temperatura < 20) {
                    System.out.print("enciendala calefacion");
                } else if ((temperatura >= 0) && (temperatura <= 25)) {
                    System.out.println("calefacion encendida no habra las ventanas");
                } else {
                    System.out.print("apague la calefacion");
                }
            }
            // parte b del ejercicio
            if ((hora >= 6) && (hora <= 11)) {
                System.out.println("ingrese un caracter minuscula");
                palabra = entrada.readLine().charAt(0);
                switch (palabra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        for (int i = 0; i <= palabra; i++) {

                        }
                        break;
                    default:
                        break;
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * 5. Escribir un programa que solicite una hora del día (valor entero de
 * la hora solamente) y resuelva en cada caso:
 * 
 * a. Si la hora está entre las 0 y las 5, pida ingresar la
 * temperatura y si la misma es menor a 20 grados imprima
 * “Encender la calefacción”. Si es mayor a 25, imprima
 * “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
 * “Calefacción encendida, no abra las ventanas!!!”.
 * 
 * b. Si la hora está entre las 6 y las 11, pida un carácter letra
 * minúscula y si es vocal imprima por la consola la cantidad de
 * vocales que tiene la palabra que corresponde con la hora.
 * Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
 * cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
 * tiene 2 consonantes.
 * 
 * c. Si la hora está entre las 12 y 17 y es par, imprima el
 * promedio entre la hora ingresada y el límite inferior del
 * rango. Si la hora es impar debe imprimir el promedio entre la
 * hora ingresada y el límite superior del rango.
 * 
 * d. Si la hora está entre las 18 y 23, pida ingresar una clave
 * numérica, si coincide con la clave almacenada previamente
 * en una constante, pida ingresar una segunda clave de
 * verificación (un valor entre 100 y 999). Para esta segunda
 * clave (que solo la conoce el usuario) se debe verificar que el
 * el dígito de mayor peso (centena) es múltiplo del dígito de
 * mayor peso de la clave almacenada. Si todo esto se cumple
 * debería mostrar por la consola el mensaje “Clave correcta”.
 * Ejemplo: clave almacenada 364, clave ingresada 364,
 * segunda clave ingresada 698.
 */