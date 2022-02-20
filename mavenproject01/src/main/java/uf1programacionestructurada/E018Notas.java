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
public class E018Notas {

    //A partir de una nota cunatitativa sacamos la nota cualitativa
    
    public static void main(String[] args) {
        float nota;
        Scanner read = new Scanner(System.in);
        System.out.println("Escribe tu nota: ");
        nota = read.nextFloat();
        System.out.println("nota no valida");
        read.nextLine();
            
        if(nota < 5){
            System.out.println("Suspenso por tonto");
        } else if(nota >= 5 && nota < 6.5){
            System.out.println("Suficiente");
        }else if(nota >= 6.5 && nota < 9){
            System.out.println("Notable");
        } else if(nota >=9 && nota <= 10){
            System.out.println("Excelente");
        }
    }
    
}
