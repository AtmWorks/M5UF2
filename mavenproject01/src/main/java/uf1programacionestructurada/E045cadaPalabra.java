/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E045cadaPalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = read.nextLine();
        int inicio = 0;
        
        
        
        
        boolean salir = false;
        do{
            int primerespacio = frase.indexOf(" ");
            
            if(primerespacio == -1){
                System.out.println(frase);
                salir = true;
            }else{
                String palabra = frase.substring(inicio, primerespacio);
                System.out.println(palabra);
                frase = frase.substring(primerespacio+1, frase.length());
            }
            
        }while(!salir);
        
        
        
        
        
    }
    
}
