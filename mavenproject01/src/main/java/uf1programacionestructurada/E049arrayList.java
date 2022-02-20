/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;
import java.util.Scanner;
import java.util.ArrayList;


public class E049arrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        //no hace falta establecer el tamaño del array
        
        //declarar Arraylist e inicializacion
        //entre <> va el tipo de dato de inicializacion del array
        ArrayList <String> cosas = new ArrayList<>();
        boolean salir = false;
        char respuesta;
        
        do{
            System.out.println("Introduce un valor");
            String valor = read.next();
            System.out.println("¿Quieres introducir un nuevo elemento? s/n");
            respuesta = read.next().charAt(0);
            
            
        }while(respuesta == 's' || respuesta == 'S');
        
        //imprimir                                   // ArrayList       Array
        for(int i=0; i<cosas.size(); i++){           // cosas.size() == cosas.length
            System.out.println(cosas.get(i));        // cosas.get(i) == cosas[i]
        }
        System.out.println(cosas);
        
    }
    
}
