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
public class E032ArrayMedia {

    //Introducimos x valores
    //Calculamos la media acumulada
    //calculamos la media de todos
    
            
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int TAM = 7;
        
        //declaramos la array
        double [] valores = new double[TAM];
        //Iniciar el array con valores por teclado
        
        for(int i=0; i<valores.length; i++){
            System.out.println("Introduce el valor " + (i+1) + ":  ");
            //validacion del tipo de dato
            if(read.hasNextDouble()){
                valores[i] = read.nextDouble();
            }else {
                i--;
                System.out.println("valor no valido");
            }
            read.nextLine();
        }
        
        double sumaAcumulada = 0;
        for(int i=0; i<valores.length; i++){
            System.out.println("El elemento " + (i+1) + " vale " + valores[i]);
            sumaAcumulada += valores[i];
        }
        
        double media = sumaAcumulada/valores.length;
        System.out.println("La media de los valores es: " + media);
    }
}
