/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

/**
 *
 * @author Alumno
 */
public class E040cuentaA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //contar cuantas palabras tienen la letra "a"
        int contador = 0;
        //arg es un array
        //lo que hemos introducido en args son los elementos del array 
        for(int i =0; i < args.length; i++){
            //comprobar si hay alguna "a" en la interacion
            if(-1 != args[i].indexOf("a")){
            contador++;
            }
        }
        System.out.println("hay " + contador + "argumentos con la letra a");
        System.out.println(args.length);
    }
}
    

