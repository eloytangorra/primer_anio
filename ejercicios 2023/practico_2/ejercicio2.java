import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero, anio;
        try {
            System.out.println("inrese un entero");
            numero = Integer.valueOf(entrada.readLine());
            switch (numero) {
                case 1:
                    System.out.println("es enero 31");
                    break;
                case 2:
                    System.out.print("ingrese el numero de año ");
                    anio = Integer.valueOf(entrada.readLine());
                    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                        System.out.println("es febrero biciesto tiene 28 dias");
                    } else {
                        System.out.println("es febrero normal tiene 29 dias");
                    }

                    break;
                case 3:
                    System.out.println("marzo 31 dias");
                    break;
                case 4:
                    System.out.println("abril 30 dias ");
                    break;
                case 5:
                    System.out.println("mayo 31 dias");
                    break;
                case 6:
                    System.out.println("junio 30 dias"); // case 1,3,5,7,8,10,12
                    break;
                case 7:
                    System.out.println("julio 31 dias");
                    break;
                case 8:
                    System.out.println("agosto 31 dias");
                    break;
                case 9:
                    System.out.println(" septiembre30 dias");
                    break;
                case 10:
                    System.out.println(" octubre 31 dias");
                    break;
                case 11:
                    System.out.println("noviembre 30 dias  ");
                    break;
                case 12:
                    System.out.println("es diciembre 31 dias");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
