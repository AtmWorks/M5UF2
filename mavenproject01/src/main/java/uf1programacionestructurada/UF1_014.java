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
public class UF1_014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Num:  ");
        int num = read.nextInt();
        int numVar = 0;
        
        while(numVar < num){
            numVar++;
            System.out.println(numVar);
        }
        
        
    }
    
}
