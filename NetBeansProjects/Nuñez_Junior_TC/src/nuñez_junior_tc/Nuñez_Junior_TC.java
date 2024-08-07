/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_tc;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_TC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        
        double area;
        double altura;
       double Areamayor=0;
       int cont;
       int trianguloMayor = 0;
        
       
       while(true){
        System.out.println("\n Ingrese que desea hacer: "+
                "\n 1.Base y altura "+
                "\n 2.Minimo Comun Multiplo y maximo Comun Divisor"+
                "\n 3. Numero perfecto");
       
        cont=lea.nextInt();
                
        if(cont==1){
        try{
                for (int triangulo = 1; triangulo <= 8; triangulo++) {
                    System.out.println("Inserte la base de su triángulo #" + triangulo + ": ");
                    double base = lea.nextDouble();
                    System.out.println("Inserte la altura del triángulo #" + triangulo + ": ");
                    altura = lea.nextDouble();

                    // Calcular el área del triángulo
                    area = (base * altura) / 2;

                    if (area > Areamayor) {
                        Areamayor = area;
                        trianguloMayor = triangulo; 
                    }
                }
                System.out.println("El area mayor es: " + Areamayor + " encontrada en el triángulo #" + trianguloMayor);
        }
        catch(InputMismatchException error){
            System.out.println("Error, ingrese un valor valido porfavor");
                    
            
            
        
        
        
        
        
        
        
        
        }
    }else if(cont==3){
        
        
        
        
    }  
        
    }
}
}