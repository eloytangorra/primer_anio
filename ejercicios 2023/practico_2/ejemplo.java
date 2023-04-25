import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo {
    public static void main(String[] args) {
        int numero = 0;
        // la declaración del buffer entrada la ubico al principio junto con las otras
        // declaraciones
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            // el usuario carga un valor la primera vez
            System.out.println("Ingrese un numero entero (0 para salir): ");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                // si número es distinto de 0 lo imprime, vuelve a pedir su carga, y regresa al
                // while
                System.out.println("El valor es: " + numero);
                System.out.println("Ingrese un numero entero (0 para salir): ");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
