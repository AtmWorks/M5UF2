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
public class E030tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Qué tabla imprimimos?");
        int num = read.nextInt();
        
        for(int i=0; i<=12; i++){
            System.out.println(i + " X " + num + " = " + i*num);
        }
        
    }
    
}
