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
public class E007Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        char caracter;
        System.out.println("Escribe una palabra: ");
        caracter = lector.next().charAt(0);
        System.out.println("Tu caracter es " + caracter);
    }
    
}
