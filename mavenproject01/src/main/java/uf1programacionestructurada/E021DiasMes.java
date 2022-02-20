
package ejemplos.uf1programacionestructurada;

import java.util.Scanner;


public class E021DiasMes {

    
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿Que mes quieres analizar? [1 - 12]: ");
        int mes = read.nextInt();
        read.nextLine();
        
        switch(mes){
            case 2:
                System.out.println("Este mes tiene 28 o 29 dias ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 dias ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 dias ");
                break;
            default:
                System.out.println("Este mes no existe");
         
        }
    }
    
}
