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
public class E027Adivina3vidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numRandom = (int)((Math.random()*10)+1);
        
        Scanner read = new Scanner(System.in);
        int num;
        
        int vidas = 3;
        boolean salir = false;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un num:\n\n0 para salir"));
            
            if(num == numRandom || num == 0){
                salir = true;
            }else{
                vidas--;
                System.out.println("Fallaste, te quedan " + vidas + "vidas");
                if(num> numRandom){
                    System.out.println("Tu num es mayor");
                }else{
                    System.out.println("Tu num es menor");
                }
                if(vidas <= 0){
                    salir = true;
                    System.out.println("Eliminado");
                }
            }
        }while(!salir);
            if(num == 0){
                System.out.println("exit con exito");
            }
            if(num == numRandom){
                System.out.println("Acertaste webon");
            }
    }
}
