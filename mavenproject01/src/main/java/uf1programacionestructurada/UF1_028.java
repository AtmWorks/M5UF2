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
public class UF1_028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int TAM = 5;
        //declaracion array
        int[]valores = new int[TAM];
        int tamActual = 0; //lo usaré como indice del array en el bucle
        Scanner read = new Scanner(System.in);
        int num = 0;//declaracion e inicializacion de num
        
        //funciona hasta que se introduzca un -1
        do{
            System.out.println("Introduce -1 para salir");
            if(read.hasNextInt()){ //validacion del tipo de dato
                num = read.nextInt();//se guarda en num si es entero
                if(num>=0){//sies positivo:
                    valores[tamActual] = num;//se guarda en la actual posicion del array
                    tamActual++;//incremento el indice
                    //hay que controlar que no crezca mas que TAM
                    if(tamActual >= valores.length){
                        
                        int aux[] = new int[valores.length+TAM];
                        for(int i = 0; i<valores.length; i++){
                            aux[i] = valores[i];
                        }
                        valores = aux;
                    }
                }
            }
            
        }while(num != -1);
        
        for(int i =0; i<tamActual; i++){
            System.out.println("En la posicion " + i + " esta el valor " + valores[i]);
        }
        
    }
    
}
