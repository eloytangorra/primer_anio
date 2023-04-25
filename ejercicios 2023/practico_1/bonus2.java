package practico_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bonus2 {

    public static void main(String[] args) {
        int importe;
        int importetotal;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("ingrese un importe ");
            importe = Integer.valueOf(entrada.readLine());
            if (importe > 13000) {
                importetotal = importe - 650;
                System.out.print("la compra le queda el precio de :" + importetotal);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * En Carrefive, los días martes y jueves hay “PROMO”. En los días
 * martes, si el importe total de la compra supera los $13.000 el
 * descuento es del 5%, pero si supera los $20.000 es del 7.5%. Los
 * jueves, en cambio, el descuento es para todos los tickets cuyo
 * importe supere los $25.000 y será el 10% con un tope de reintegro
 * de $3.000 por ticket. Escribir un programa que dado el día de la
 * semana que se hace la compra y el importe del ticket, verifique si
 * aplica hacer el descuento o no. Puede suponer un dato numérico
 * para cada día, ejemplo: 1 para el martes y 2 para el jueves.
 */
