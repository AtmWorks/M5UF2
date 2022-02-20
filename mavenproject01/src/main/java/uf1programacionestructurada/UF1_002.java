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
public class UF1_002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("valor de x: ");
        int x = read.nextInt();
        System.out.println("El doble de x es " + "y = " + x*2);
        System.out.println("El triple de x es " + "y = " + x*3);
    }
    
}
