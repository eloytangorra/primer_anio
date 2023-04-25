import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3 {
    public static void main(String[] args) {
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un entero ");
            numero = Integer.valueOf(entrada.readLine());
            if (numero > 50) {

                if ((numero % 2 == 0) || (numero % 3 == 0)) {
                    System.out.println("bien amigio");

                }
            } else {
                System.out.println("ingrese un numero mayor a 50 ");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
