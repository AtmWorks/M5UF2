/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;

//array de 10 enteros
//leer 8 numeros
//pedir num y pos
// instertar y desplazar



/**
 *
 * @author Alumno
 */
public class UF1_027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista [] = new int[10];
        int numero, pos;
        Scanner read = new Scanner(System.in);
        
        //leer valores num
        
        for(int i = 0; i < 8; i++){
            System.out.println("Introduce un num");
            lista[i] = read.nextInt();
        }
        //pedimos el nuevo numero y la posicion
        System.out.println("Introduce el nuevo numero: ");
        numero = read.nextInt();
        System.out.println("Introduce la posicion: ");
        pos = read.nextInt();
        
        //suponemos que la posicion esta entre 0 y 7
        
        //desplazamiento de los elementos de la tabla
        for(int i = 7; i >= pos; i--){
            lista[i+1] = lista[i];
            lista[pos] = numero;
        }
        
        System.out.println("la tabla del demonio: ");
        for(int i = 0; i<9; i++){
            System.out.println(lista[i]);
              
        }
        
    }
    
}
