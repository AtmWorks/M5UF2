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
public class E013IfMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int  num1, num2;
        System.out.println("Introduce un numero: ");
        num1 = read.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = read.nextInt();
        
        
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
            System.out.println(num2 + " es menor que " + num1);
        
        }
        System.out.println("--------------------\nFin del programa\n--------------------\n");
        
        
        
    }
    
}
