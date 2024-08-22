/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_biarray;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_BiArray {

    
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);
    int sumaPrincipal=0;
    int sumadiagonal=0;
    int sumaDiagonal=0;
    
        System.out.println("Ingrese el numero de filas y columnas que desea:");
        int tamaño=lea.nextInt();
        
        int arregloNum[][]= new int [tamaño][tamaño];
        
        Random numRandom=new Random();
        
        for (int cont = 0; cont < tamaño; cont++) {
            
            for (int cont2 = 0; cont2 < tamaño; cont2++) {
                
                arregloNum[cont][cont2]= 10+ numRandom.nextInt(90);
                System.out.print(arregloNum[cont][cont2]+ " ");
                
            }
            System.out.println();
        }
        for (int cont3 = 0; cont3 < tamaño; cont3++) {
            
            sumaDiagonal+= arregloNum[cont3][cont3];
            
        }
        System.out.println();
        System.out.println("Suma de la diagonal1; "+ sumaDiagonal);
     }
        
        
        
        
    }
    

