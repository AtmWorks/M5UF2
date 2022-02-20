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
public class E047acronimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = read.nextLine();
        
        //Separamos la frase en palabras, espacios en blancos como separadores.
        String [] palabras = frase.split(" ");
        
        for(int i=0; i<palabras.length; i++){
            String letra = palabras[i];
            System.out.print(letra.charAt(0));
            System.out.print(palabras[i].substring(0,1));
        }
    }
}
