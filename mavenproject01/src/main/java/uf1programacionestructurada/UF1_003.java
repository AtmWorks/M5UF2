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
public class UF1_003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("T en ºC: ");
        int centigrados = read.nextInt();
        double fahrenheit = (centigrados*1.8) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
    }
}
