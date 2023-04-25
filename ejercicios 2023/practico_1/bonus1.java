package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus1 {
    public static void main(String[] args) {
        final String fecha = "04/04/23";
        final String hora = "18:55";
        final String eslogan = "El precio lo pone el cliente";
        final String nombrecajero = "pavo";
        final int numerocaja = 7;
        final int numeroticket = 12;
        final int cuit = 99 - 33393932 - 9;
        int dni;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su dni");
            dni = Integer.valueOf(entrada.readLine());
            System.out.print(fecha + "-\t" + hora + "Ticket nro \t" + numeroticket + "\n"
                    + cuit + "\n"
                    + "cajero\t" + nombrecajero + ":" + numerocaja + "\n" +
                    "DNI:" + dni + "\t" + eslogan);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

/*
 * La cadena de supermercados Carrefive debe imprimir el
 * encabezado del ticket de compra de los clientes con cierto formato
 * para cumplir las exigencias de la Administración Federal de
 * Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora,
 * número de ticket, CUIT, nombre del cajero, número de caja, dni
 * del cliente y la leyenda “El precio lo pone el cliente”. Un ejemplo
 * se muestra a continuación:
 * —-----------------------------------------------------------------
 * 04/04/23 - 18:55 Ticket Nro. 3455674
 * 
 * CUIT: 99-34567833-9
 * 
 * Cajero: Luis Mercado Caja: 8
 * DNI: 33.333.333 “El precio lo pone el cliente”
 */