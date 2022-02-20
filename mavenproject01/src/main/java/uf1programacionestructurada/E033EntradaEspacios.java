/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;
import java.util.Scanner;

public class E033EntradaEspacios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos el tamaño el array con una cte
        final int TAM = 10;
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce " + TAM + " numeros enteros: ");
        //Datos introducidos en la misma linea separados por espacios
        
        //contador de valores
        
        int contador = 0;
        while(contador < TAM){
            //validar si hay entero en el buffer
            if(read.hasNextInt()){
                int valor = read.nextInt();
                System.out.println("El valor " + (contador + 1) + " leido: " + valor);
                contador++;
            }else{
                //no hay entero en el buffer
                //se ignora y el contador no avanza
                read.next();
                System.out.println("Num no valido, introduce un entero hdp");
            }
        }
        
        //Si hay mas valores se ignoran
        read.nextLine();
        System.out.println("Ya se han leido " + TAM + " valores");
    }
}
