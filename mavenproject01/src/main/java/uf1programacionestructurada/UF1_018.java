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
public class UF1_018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //contadores de postivos y negativos
        int pos = 0;
        int neg = 0;
        
        int [] valores = new int[10];
        
        double sumaPos = 0;
        double sumaNeg = 0;
        
        //lectura de datos y asignacion de datos al array
        System.out.println("Lectura de los elementos del array: ");
        for(int i=0; i < 10; i++){
            if(valores[i] > 0){
                sumaPos += valores[i];
                pos++;
                
            }else if (valores[i] < 0){
                sumaNeg += valores[i];
                neg++;
            }
        }
        
        if(pos != 0){
            System.out.println("Media de los valores positivos: " + sumaPos/pos);
        }else{
            System.out.println("No hay ningun valor positivo");
        }
        
        if(neg != 0){
            System.out.println("Media de los valores negativos: " + sumaNeg/neg);
        }else{
            System.out.println("No hay ningun negativo");
        }
        
    }
    
}
