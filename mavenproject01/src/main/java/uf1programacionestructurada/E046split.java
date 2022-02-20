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
public class E046split {

    //Invertir el orden de las palabras
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = read.nextLine();
        
        //Separamos la frase en palabras, espacios en blancos como separadores.
        String [] palabras = frase.split(" ");
        for(int i=palabras.length-1; i>=0; i--){
            System.out.print(palabras[i] + " ");
            
        }
        
        
        
    }
    
}
