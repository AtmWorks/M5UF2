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
public class E041equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //comprobar si en array args axiste cierto argumento 
        //tiene argumentos?
        if(args.length > 0){
            //recorrer el array 
            for(int i = 0; i < args.length; i++){
                if(args[i].equals("hola")){
                    System.out.println("el argumento " + (i+1) + " es \"hola\"");
                } else {
                    System.out.println("el argumento " + (i+1) + "no es \"hola\"");
                }
            }
        }
    }

}
