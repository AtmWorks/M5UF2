/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E015precioTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos cte precio transporte
        final float TRANSPORTE = 5;
        //Declaramos cte compra minima
        final float COMPRA_MINIMA = 30;
        //dcelaramos objeto scanner
        Scanner read = new Scanner(System.in);
        //conseguir valores
        System.out.println("¿Cual es el valor de la compra? ");
        float precio = read.nextFloat();
        
        //evaluacion
        //si evalua T ejecuta el bloque de codigo
        //si evalua false, lo ignora
        if(precio < COMPRA_MINIMA){
            precio += TRANSPORTE;   
        }
        System.out.println("El precio final es " + precio + "€");
    }
}
