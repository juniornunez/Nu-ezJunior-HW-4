/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_juniortarea2;

import java.util.Scanner;

/**
 *
 * @author Junior Nuñez
 */
public class Nuñez_JuniorTarea2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("\n***MENU***" +
                "\n Ingrese la opcion que desea" +
                "\n 1. Palabra diagonal" +
                "\n 2. Piramide de numero" +
                "\n 3. Lista de palindromo y no" +
                "\n 4. Salir");
            op = lea.nextInt();
            lea.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingresa una palabra por favor: ");
                    String palabrita = lea.nextLine();

                    for (int desplazar1 = 0; desplazar1 < palabrita.length(); desplazar1++) {
                        for (int desplazar2 = 0; desplazar2 < desplazar1; desplazar2++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabrita.charAt(desplazar1));
                    }
                    break;

                case 2:
                    System.out.println("Numero de Filas: ");
                    int numFilas = lea.nextInt();

                    int contFilas = 1;

                    for (int espacio1 = numFilas; espacio1 > 0; espacio1--) {
                        for (int espacio2 = 1; espacio2 <= espacio1; espacio2++) {
                            System.out.print(" ");
                        }

                        for (int espacio2 = 1; espacio2 <= contFilas; espacio2++) {
                            System.out.print(contFilas + " ");
                        }

                        System.out.println();
                        contFilas++;
                    }
                    break;

                case 3:
                    String palabra;
                    int cantpalabras = 0;
                    int numpalabras = 0;
                    int contadorlistaP = 0;
                    int contadorlistaNOP = 0;
                    String palabraR = "";
                    String listaPalindromos = "";
                    String listaNoPalindromos = "";

                    System.out.println("Favor ingrese la cantidad de palabras: ");
                    cantpalabras = lea.nextInt();

                    for (int contadorpalabra1 = 0; contadorpalabra1 < cantpalabras; contadorpalabra1++) {
                        numpalabras = contadorpalabra1 + 1;
                        System.out.println("Favor ingrese la palabra" + numpalabras + ": ");
                        palabra = lea.next().toLowerCase();
                        for (int contpalindromo = palabra.length() - 1; contpalindromo >= 0; contpalindromo--) {
                            char letra = palabra.charAt(contpalindromo);
                            palabraR += letra;

                        }
                        if (palabraR.equals(palabra)) {
                            contadorlistaP++;
                            listaPalindromos += contadorlistaP + ": " + palabra + "\n";

                        } else {
                            contadorlistaNOP++;
                            listaNoPalindromos += contadorlistaNOP + ": " + palabra + "\n";
                        }
                        palabraR = "";

                    }
                    System.out.println("**PALINDROMOS**");
                    System.out.println(listaPalindromos);
                           
                    System.out.println("**NO PALINDROMOS**");
                    System.out.println(listaNoPalindromos);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Esta opcion no es valida");
                    break;
            }
        } while (op != 4);

    }
}




    
    
   

