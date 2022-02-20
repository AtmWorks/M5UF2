/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;


public class E019SemanaSwitch {
    
   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dia;
        System.out.println("Introduce el numero correspondiente al dia de la semana");
        dia = read.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
        }
    }
    
}
