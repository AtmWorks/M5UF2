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
public class E034preguntaTamaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tamaño = 0;
        
        boolean salir = false;
        
        //creamos la estructura de validacion do ... while (+if)
        do{
            System.out.println("De que tamaño quieres el Array hijo de la gran puta!!!???");
            if(read.hasNextInt()){
                tamaño = read.nextInt();
                salir = true;
            }else{
                read.next();
            }
        }while(!salir);
        
        //array
        
        double valores[] = new double[tamaño];
        for(int i=0; i<tamaño; i++){
            System.out.println("Introduce los valores hijo de la gran puta!!!???");
            if(read.hasNextDouble()){
                valores[i] = read.nextDouble();
                System.out.println("El valor " + (i + 1) + " leido: " + valores[i]);
            }else{
                i--;
                read.next();
            }
        }
    }
    
}
