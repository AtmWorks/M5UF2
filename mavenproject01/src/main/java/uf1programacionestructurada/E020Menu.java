
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;


public class E020Menu {

    // generar un menu de seleccion
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Selecciona una opcion\n1: Opcion 1\n2: Opcion 2\n3. Opcion 3");
        int seleccion = read.nextInt();
        
        switch(seleccion){
            case 1:
                System.out.println("Seleccionaste 1");
                break;
            case 2:
                System.out.println("Seleccionaste 2");
                break;
            case 3:
                System.out.println("Seleccionaste 3");
                break;
            default:
                System.out.println("Opcion no existe");
        }
    }
}
