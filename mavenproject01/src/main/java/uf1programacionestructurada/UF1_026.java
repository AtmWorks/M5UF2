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
public class UF1_026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos el array
        int numeros [] = new int[10];
        //variables booleanas
        boolean creciente = false;
        boolean decreciente = false;
        
        //lectura de nums
        System.out.println("Introduce 10 nums: ");
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            numeros[i] = read.nextInt();
        }
        
        //comprobacion del orden
        
        for(int i = 0; i < 9; i++){
            if(numeros[i] > numeros[i+1]){
                decreciente = true;//en este momento es decreciente
            }
            if( numeros[i] < numeros[i+1]){
                creciente = true;//en este momento es creciente
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("Serie creciente");
        }
        
        if(creciente == false && decreciente == true){
            System.out.println("Serie decreciente");
        }
        
        if(creciente == true && decreciente == true){
            System.out.println("desordenanda");
        }
        
        if(creciente == false && decreciente == false){
            System.out.println("Todos los numeros son iguales");
        }
    }
    
}
