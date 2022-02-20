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
public class UF1_008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce un num1: ");
        num1 = read.nextInt();
        System.out.println("Introduce un num2: ");
        num2 = read.nextInt();
        System.out.println("Introduce un num3: ");
        num3 = read.nextInt();
        
        System.out.println("num1" + " = " + num1 + "\nnum2" + " = " + num2  + "\nnum3" + " = " + num3);
        
        if(num1 > num2){
            if(num1 > num3){
                System.out.println("Num1 el mas grande");
            }
        }
    }
}
