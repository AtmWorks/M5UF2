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
public class E036separarStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = read.next();
        
        for(int i = 0; i < palabra.length() ; i++){
            System.out.println(palabra.charAt(i));
        }
    }
}
