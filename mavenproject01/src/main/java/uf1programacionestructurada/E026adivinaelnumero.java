/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;
import javax.swing.JOptionPane;





/**
 *
 * @author Alumno
 */
public class E026adivinaelnumero {


    public static void main(String[] args) {
        //generar un numero aleatorio
        //Clase math, metodo random
        //random devuelve un double entre 0.0 y 1.0
        //(int)(math.random()*max)+min)
        int numRandom = (int)((Math.random()*10)+1);
        //System.out.println(numRandom);
        Scanner read = new Scanner(System.in);
        int num;
        boolean salir = false;
        
        do{
            System.out.println("Adivina el num entre 1 y 10");
            System.out.println("Pon un 0 para salir");
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un num madafaka: "));
            if(num == 0){
                salir = true;
            }else{
                if(num == numRandom){
                    System.out.println("Acertaste");
                    salir = true;
                } else {
                    System.out.println("Fallaste");
                }
            }
             
        }while(!salir);
        System.out.println("FIN");
        JOptionPane.showMessageDialog(null, "FINNNNNN");
    }
}
