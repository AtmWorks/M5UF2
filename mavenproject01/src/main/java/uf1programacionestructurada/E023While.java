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
public class E023While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Introduce un num del 1 al 8: ");
        num = read.nextInt();
        
        while(num < 5){
            System.out.println("El numero " + num + " es menor que 5");
            num++;
        }
    }
}
