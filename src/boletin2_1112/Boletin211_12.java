/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1112;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin211_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sueldoFijo, ventas, km, diasDesp, sueldoLiq, sueldoNeto;
        //System.out.println("Introduce el sueldo fijo");
        //Scanner sueldoFijoIntrodu = new Scanner(System.in);
        //sueldoFijo = sueldoFijoIntrodu.nextFloat();
        String sueldoFijoIntrodu = JOptionPane.showInputDialog("Introduce el sueldo fijo");
        sueldoFijo = Float.parseFloat(sueldoFijoIntrodu);
        System.out.println("Introduce las ventas");
        Scanner ventasIntrodu = new Scanner(System.in);
        ventas = ventasIntrodu.nextFloat();
        System.out.println("Introduce los km realizados");
        Scanner kmIntrodu = new Scanner(System.in);
        km = kmIntrodu.nextFloat();
        System.out.println("Introduce los dias que te has desplazado");
        Scanner diasDespIntrodu = new Scanner(System.in);
        diasDesp = diasDespIntrodu.nextFloat();
        sueldoLiq = (float) (sueldoFijo + (ventas*0.05)+(km*2)+(diasDesp*30));
        System.out.printf("El sueldo liquido es %.2f %n :", sueldoLiq);
        sueldoNeto = (float) (sueldoLiq*0.82 -36);
        System.out.printf("El sueldo neto es %.2f %n ", sueldoNeto);
    }
    
}
