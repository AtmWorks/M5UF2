/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class E012JOptionPaneInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //int num = JOptionPane.showInputDialog(null, "Introduce un num madafaka: ");
        //necesitamos hacer una conversion de tipo
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un num madafaka: "));
        JOptionPane.showMessageDialog(null, "Tu num es:\n" + num);
        
        
    }
    
}
