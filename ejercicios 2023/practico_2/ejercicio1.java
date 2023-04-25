import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero, numero2, numero3, numero4, numero5, numero6;
        char letra;
        try {
            System.out.println("ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
            if (numero > 0) {
                System.out.println("numero es positivo");
            } else {
                System.out.println("numero es negativo ");
            }
            System.out.println("ingrese un segundo numero entero");
            numero2 = Integer.valueOf(entrada.readLine());
            if (numero2 > 100) {
                System.out.println("grande");
            } else {
                System.out.println("chico");
            }
            System.out.println("ingrese un tercer numero entero");
            numero3 = Integer.valueOf(entrada.readLine());
            switch (numero3) {
                case 1:
                    System.out.println("es lunes");
                    break;
                case 2:
                    System.out.println("es martes");
                    break;
                case 3:
                    System.out.println("es miercoles");
                    break;
                case 4:
                    System.out.println("es jueves");
                    break;
                case 5:
                    System.out.println("es viernes");
                    break;
                case 6:
                    System.out.println("es sabado");
                    break;
                case 7:
                    System.out.println("es domingo");
                    break;
                default:
                    break;
            }
            System.out.println("ingrese una letra ");
            letra = entrada.readLine().charAt(0);
            switch (letra) {
                case 'a':
                    System.out.println("es vocal");
                    break;
                case 'e':
                    System.out.println("es vocal");
                    break;
                case 'i':
                    System.out.println("es voccal");
                    break;
                case 'o':
                    System.out.println("es vocal");
                    break;
                case 'u':
                    System.out.println("es vocal");
                    break;

                default:
                    System.out.println("es consonante");
                    break;
            }
            System.out.println("ingrese un tercer numero entero");
            numero4 = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese un tercer numero entero");
            numero5 = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese un tercer numero entero");
            numero6 = Integer.valueOf(entrada.readLine());
            if ((numero4 <= numero5) && (numero5 <= numero6)) {
                System.out.println("esta en orden creciente");
            } else if ((numero4 >= numero5) && (numero5 >= numero6)) {

            } else {
                System.out.print("no esta ordenando paaaa");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
