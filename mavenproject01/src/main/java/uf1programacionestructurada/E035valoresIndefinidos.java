/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.uf1programacionestructurada;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;


public class E035valoresIndefinidos {

   //declarar un array
    //cargamos cantidad indefinida de valores
    //creamos una bandera para salir (s)
    //calcular suma acumulada
    //calcular media
    
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner entrada = new Scanner(System.in);
        double []valores = new double[TAM];
        boolean salir = false;
        int contador = 0;
        
        //estructura para pedir valores
        do {
            System.out.println("Introduce el valor " + (contador+1));
            System.out.println("S para salir");
            //validar el tipo de dato
            //si es double, lo guardamos en el array e incrementamos el contador (Ã­ndice)
            if(entrada.hasNextDouble()){
                valores[contador] = entrada.nextDouble();
                contador++;
            } else {
                //si no es double, vamos a ver si es S o s
                char leido = (char)entrada.next().charAt(0);
                if(leido=='s'||leido=='S'){
                    salir = true;
                } else {
                    System.out.println("Valor no vÃ¡lido");
                }
            }
            //limpiar el buffer
            entrada.nextLine();
            //comprobar si el Ã­ndice ha llegado a TAM.
            //TAM es la cantidad mÃ¡xima, por tanto el Ãºltimo Ã­ndice es TAM-1
            //Si llega a TAM, nos hemos pasado
            if(contador == TAM){
                salir = true;
                System.out.println("Has superado el lÃ­mite de " + TAM);
            }
        }while(!salir);
        
        //calcular suma acumulada y media
        //recorrer array con un for
        double suma = 0;
        for(int i=0; i<contador; i++){
            System.out.println("El elemento " + (i+1) + " vale " + valores[i]);
            suma += valores[i];
        }
        
        //imprimir la soluciÃ³n
        System.out.println("La suma acumulada de los elementos del array es " + suma);
        System.out.println("La media es: " + (suma/contador));
    }
}
