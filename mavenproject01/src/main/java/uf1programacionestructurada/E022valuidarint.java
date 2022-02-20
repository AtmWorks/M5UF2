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
public class E022valuidarint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num;
        
        if(read.hasNextInt()){
            num = read.nextInt();
            System.out.println("Este es tu numero " + num + ".");
        }else{
            System.out.println("Esto no es un numero valido");
        }
    }
    
}
