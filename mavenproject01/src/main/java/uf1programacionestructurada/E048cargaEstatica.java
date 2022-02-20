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
public class E048cargaEstatica {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuantos elementos tiene el array?");
        int numElementos = read.nextInt();
        
        //declarar y crear el array
        String cosas [] = new String[numElementos];
        
        //inicializar el array
        for(int i=0; i<cosas.length; i++){
            System.out.println("Introduce el valor del elemento " + (i + 1));
            cosas[i] = read.next();
        }
    }
    
}
