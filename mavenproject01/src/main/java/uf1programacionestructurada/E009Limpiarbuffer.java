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
public class E009Limpiarbuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nombre, direccion;
        int edad;
        System.out.println("Escriba su nombre pendejo: ");
        nombre = read.nextLine();
        
        System.out.println("Escriba su edad pendejo: ");
        edad = read.nextInt();
        
        read.nextLine(); //limpiar buffer > aplicar el metodo sin asignar el valor a ninguna variable
        
        System.out.println("Escriba su direccion pendejo: ");
        direccion = read.nextLine();
        
        System.out.println("Datos introducidos: \n-----------------\n");
        System.out.println("Su nombre  de pendejo es: " + nombre);
        System.out.println("Su edad  de pendejo es: " + edad);
        System.out.println("Su direccion  de pendejo es: " + direccion);
    }
    
}
