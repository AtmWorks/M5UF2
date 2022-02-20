/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

//existe un precio de transporte 

import java.util.Scanner;

//Con compras a partir de 30€ transporte gratis
//Con compra a partir de 100€ 15% descuento
public class E016Preciorebajado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float TRANSPORTE = 5;
        final float DESCUENTO = 0.15f;
        final float COMPRA_MIN = 30;
        final float COMPRA_MIN_DTO = 100;
        
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cual es el valor de la compra? ");
        float precio = read.nextFloat();
        read.nextLine();
        
        if(precio < COMPRA_MIN){
            precio += TRANSPORTE;
        }else if(precio >= COMPRA_MIN_DTO){
            precio -= (precio*DESCUENTO);
        }
        System.out.println("El precio final es " + precio + "€");
    }
}
