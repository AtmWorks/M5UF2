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
public class PR2UF1M03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Introduce un numero: ");
        num = read.nextInt();
        int reverso = 0;
        
        while(num != 0){
            int remainder = num%10;
            reverso = reverso*10 +remainder;
            num = num/10;

        }       
        System.out.println("El numero al reves es: " + reverso);
        
        
        
    }
    
}
