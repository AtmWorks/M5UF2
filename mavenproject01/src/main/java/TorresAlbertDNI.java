import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Albert
 */
public class TorresAlbertDNI {

   
    public static void main(String[] args) 
    {
        // CREAR LAS VARIABLES NECESARIAS
        int numID;
        int resto;
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};  
        char letraUser;
        boolean correcto = false;
        Scanner scan = new Scanner (System.in);
        
        do
        { 
            //PEDIR NUMERO Y LETRA DE DNI AL USUARIO
            System.out.println("Escribe tu numero de DNI");
            numID = scan.nextInt();
            System.out.println("Escribe tu letra de DNI");
            letraUser = scan.next().charAt(0);
            System.out.println("Tu numero es: " + numID);
            
            //COMPROBAR QUE EL NÚMERO ESTÉ EN EL RANGO CORRECTO
            if(numID>0 && numID<99999999)
            {
                //CALCULAR LA LETRA DEL DNI
                resto = numID % 23;
                System.out.println("El resto es: " + resto);
                System.out.println("La letra resultante es: " + letra [resto]);
                System.out.println("La letra que has introducido es: " + letraUser);
                
                // (っº▿º)っ♡ PROPUESTA DE MEJORA PARA EL PUNTILLO EXTRA: PASAR LA LETRA DEL USUARIO A MAYÚSCULAS */
                if(Character.isLowerCase(letraUser))
                {letraUser = Character.toUpperCase(letraUser);} 

                //COMPROBAR QUE LA LETRA INTRODUCIDA POR EL USUARIO ES CORRECTA.
                if (letraUser == letra[resto])
                {
                System.out.println("Tu DNI es CORRECTO.");
                correcto = true;
                }
                else
                {
                    System.out.println("Tu letra de DNI es incorrecta.");
                }
            }
            else
            {
                System.out.println("El numero es incorrecto.");
            }
        }
        while(!correcto);
        scan.nextLine();
    }
    
    
}
