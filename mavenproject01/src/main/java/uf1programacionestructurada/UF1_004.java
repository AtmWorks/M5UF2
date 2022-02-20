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
public class UF1_004 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Escribe un numero de 5 cifras: ");
        int num = read.nextInt();
        System.out.println(num/10000);
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num/1);
    }
} 
