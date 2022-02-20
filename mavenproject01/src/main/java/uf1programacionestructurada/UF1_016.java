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
public class UF1_016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int menor;
        int mayor;
        boolean different = false;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Introduce num1 and num2: ");
            num1 = read.nextInt();
            num2 = read.nextInt();
            if(num1 != num2){
                different = true;
            }
        }while(!different);
        
        if(num1 < num2){
            menor = num1;
            mayor = num2;
        }else{
            mayor = num1;
            menor = num2;
        }
        
        while(menor<mayor){
            menor++;
            System.out.println(menor);
        }
        
        
        
            
    }
    
}
