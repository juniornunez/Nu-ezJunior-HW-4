/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_prueba1lab;

import java.util.Scanner;

/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_Prueba1Lab {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("\n Ingrese que desea hacer: " +
                    "\n1. Palabra Alreves" +
                    "\n2. Numero perfecto" +
                    "\n3. Primos" +
                    "\n4. Votaciones" +
                    "\n5. Salir");
            int siguiente = lea.nextInt();
           
            switch (siguiente) {
                case 1:
                    System.out.println("Ingrese una palabra");
                    String palabrita = lea.nextLine();
                    
                    for (int i = palabrita.length() - 1; i >= 0; i--) {
                        System.out.print(palabrita.charAt(i));
                    }
                   
                    break;
                    
                case 2:
                    
                case 3:
                    
                    

                case 5:
                    System.out.println("Saliendo del programa...");
                   

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
