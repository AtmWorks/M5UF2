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
public class E042compareTo {

    public static final String MES_SECRETO = "julio";
    
    public static void main(String[] args) {
        // adivinar un mes dando pistas
        Scanner read = new Scanner(System.in);
        System.out.println("Adivina el mes...");
        boolean acierto = false;
        while(!acierto){
            System.out.println("¿Qué mes crees que es el que tengo en la mente?");
            String intento = read.next();
            read.nextLine();
            int posicion = intento.compareTo(MES_SECRETO);
            System.out.println(posicion);
            if(posicion<0){
                //intento es anterior al mes secreto
                System.out.println("Has fallado, el mes va despues alfabeticamente");
            } else if (posicion > 0){
                System.out.println("Has fallado, el mes va antes alfabeticamente");
            } else {
                acierto = true;
            }
        }System.out.println("Acertaste!");
        
    }
    
}
