/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin211_12;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin211_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sueldofijo, ventas, km, diasdesplazado, sueldol;
        System.out.println("Introduce el sueldo fijo");
        Scanner sueldofijoTeclado = new Scanner(System.in);
        sueldofijo = sueldofijoTeclado.nextFloat();
        System.out.println("Introduce el importe de las ventas");
        Scanner ventasTeclado = new Scanner(System.in);
        ventas = ventasTeclado.nextFloat();
        System.out.println("Introduce los km echos");
        Scanner kmTeclado = new Scanner(System.in);
        km = kmTeclado.nextFloat();
        System.out.println("Introduce los dias de desplazamiento");
        Scanner diasdesplazadoTeclado = new Scanner(System.in);
        diasdesplazado = diasdesplazadoTeclado.nextFloat();
        sueldol = (float) (sueldofijo + (ventas*0.05)+(km*2)+(diasdesplazado*30));
        System.out.println("El sueldo liquido es :"+sueldol);
        System.out.println("El sueldo neto es :"+((sueldol*0.82)-36));
    }
    
}
