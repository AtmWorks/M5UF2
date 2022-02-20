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
public class E025bandera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        
        boolean cero = false;
        
        do{
            System.out.println("Pon un 0 para salir");
            num = read.nextInt();
            if(num == 0){
                cero = true;
            }
        }while(!cero); //while(cero == false) o mesmo
            System.out.println("FIN");
        
    }
}
