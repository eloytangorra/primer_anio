package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main(String[] args) {
        char factura;
        int numerofactura;
        String nombre;
        String producto1;
        String producto2;
        float importe1;
        float importe2;
        float importetotal;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su nombre");
            nombre = entrada.readLine();
            System.out.println("ingrese tipo de factura que quiere");
            factura = entrada.readLine().charAt(0);
            System.out.println("ingrese el numero de factura que quiere");
            numerofactura = Integer.valueOf(entrada.readLine());
            System.out.println("ingreseel producto que quiere comprar");
            producto1 = entrada.readLine();
            System.out.println("ingrese el importe del producto1");
            importe1 = Float.valueOf(entrada.readLine());
            System.out.println("ingreseel producto 2 que quiere comprar");
            producto2 = entrada.readLine();
            System.out.println("ingrese el importe del producto2");
            importe2 = Float.valueOf(entrada.readLine());
            importetotal = importe1 + importe2;
            System.out.println(
                    "factura \t" + factura + "\t" + numerofactura + "\n"
                            + "nombre \t" + nombre + "\t" + "\n"
                            + producto1 + "\t" + importe1 + '\n'
                            + producto2 + "\t" + importe2 + "\n"
                            + importetotal);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * Escribir un programa que pida se ingresen datos necesarios para
 * emitir una factura por la compra de dos artículos de librería (tipo
 * factura, número, nombre cliente, producto 1, importe 1, producto 2,
 * importe 2, importe total). Como salida debe imprimir por pantalla la
 * factura en un formato similar al del siguiente ejemplo:
 * 
 * Factura C N 249
 * Nombre: Juan Perez
 * Producto Importe
 * Lápiz 15.5
 * Papel 20.6
 * Importe total 36.1
 */
