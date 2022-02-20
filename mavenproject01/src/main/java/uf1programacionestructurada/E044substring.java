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
public class E044substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = read.nextLine();
        //Buscamos el primer y el ultimo espacio en blanco
        int inicioSubstring = frase.indexOf(" ");
        int finSubstring = frase.lastIndexOf(" ");
        System.out.println("La frase sin la primera y la ultima es: ");
        if(inicioSubstring == finSubstring){
            //no hay espacios -> evalua -1
            //si solo hay dos palabras, evalua la misma posicion
            //en cualquiera de estos dos pasos no se muestra nada
        }else{
            //en caso de lo contrario, hay que mostrar una cadena intermedia
            //la segunda palabra empieza tras el segundo espacio en blanco
            //creo una variable para guardar 
            String fraseFinal = frase.substring(inicioSubstring +1, finSubstring);
        }
    }
    
}
