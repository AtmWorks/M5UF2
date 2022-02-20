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
public class E008tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // def Scanner lector
        Scanner reed = new Scanner(System.in);
        // Pregunta al usuario
        System.out.println("¿Qué tabla quieres imprimir?");
        // aplica Scanner lector
        int tabla = reed.nextInt();
        
        
        // def multiplicando
        int multiplicando = 0;
        
        System.out.println("----------------");
        System.out.println("TABLA DEL " + tabla);
        System.out.println("----------------");
        
        
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        System.out.println(tabla + " X " + multiplicando + " = " + (multiplicando * tabla));
        multiplicando += 1;
        
    } 
    
}
