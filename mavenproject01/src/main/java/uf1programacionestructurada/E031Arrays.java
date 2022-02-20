/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E031Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de una array
        final int TAM = 6;
        int valores[] = new int[TAM];
        Scanner read = new Scanner(System.in);
        
        
        
        //inicializar el array
        for(int i=0; i<valores.length; i++){
            System.out.println("Introduce un num entero");
            valores[i] = read.nextInt();
            System.out.println("----\n" + valores[i]);
            
        }
    }
    
}
