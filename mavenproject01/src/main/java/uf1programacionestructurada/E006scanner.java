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
public class E006scanner {
    
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = lector.next();
        System.out.println("Nombre: " + nombre);
        
        System.out.println("Escribe tu edad: ");
        int edad = lector.nextInt();
        System.out.println("Edad: " + edad + " años");
    }      
}
