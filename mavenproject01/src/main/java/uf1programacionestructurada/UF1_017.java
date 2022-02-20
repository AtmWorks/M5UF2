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
public class UF1_017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numA;
        int numB;
        Scanner read = new Scanner(System.in);
        boolean aLessThanB = false;
        do{
            System.out.println("Type numA and numB, A smaller tan B");
            numA = read.nextInt();
            numB = read.nextInt();
            if(numA<numB){
                aLessThanB = true;
            }
        }while(!aLessThanB);
        
        
    }
    
}
