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
public class UF1_009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int hora, mins, segs;
        System.out.println("Introduce una hora: ");
        hora = read.nextInt();
        System.out.println("Introduce los minutos: ");
        mins = read.nextInt();
        System.out.println("Introduce los segundos: ");
        segs = read.nextInt();
        
        if(hora >= 0 && hora < 24 && mins >= 0 && mins < 60 && segs >= 0 && segs < 60){
            System.out.println("Hora recorrecta");
        }else{
            System.out.println("Hora no correcta HDP");
        }
    }
}
