
package nuñez_juniore1;

import java.util.Scanner;

/**
 *
 * @author Junior Nuñez
 */
public class Nuñez_JuniorE1 {

    public static void main(String[] args) {
        
        Scanner lea= new Scanner(System.in);
        
        while(true){
            
            
            int opcion=0;
            int continuar;
            
            
            try{
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("1. PIRAMIDE");
            System.out.println("2. EL MAYOR");
            System.out.println("3. CLIENTES");
            System.out.println("4. CARACTERES VOCALES");
            System.out.println("5. SALIR");
            opcion=lea.nextInt();
            
            
            }catch(Exception e){
                System.out.println("Ingrese un dato valido");
                lea.nextLine();
                
            }
            
        if(opcion==1){
            try{
         System.out.println("Ingrese la altura:" );
        int altura=lea.nextInt();
        for (int cont1 = 1 , NumeroFila=1; cont1 <= altura; cont1++) {
        int suma=0;
        
        
            for (int cont2 = 0; cont2 < cont1; cont2++) {
                System.out.print(NumeroFila+" ");
                suma += NumeroFila;
                NumeroFila+=2;
            }
            System.out.print(" = "+suma+"\n");
          }
            }catch(Exception e){
                System.out.println("Ingrese un dato valido");
                lea.nextLine();
            }
        
        }else if(opcion==2){
          
            try{
                System.out.println("Ingrese su numero:");
                double maxNumero = lea.nextDouble(); 
                double sumaNumeros = maxNumero; 
                int contadorNumeros = 1; 
                
                do {
                    System.out.println("Ingrese otro numero:");
                    double nums = lea.nextDouble();
                    sumaNumeros += nums; 
                    contadorNumeros++;
                    if (nums > maxNumero) {
                        maxNumero = nums;
                        
                    }
                    System.out.println("Desea seguir ingresando numeros? (1.Si / 2.No)");
                    continuar = lea.nextInt();
                    
                } while (continuar == 1);
                
                
                double promedio = sumaNumeros / contadorNumeros; 
                
                
                System.out.println("El numero mayor es: " + maxNumero);
                System.out.println("El promedio de los numeros ingresados es: " + promedio);
            }catch(Exception e){
                System.out.println("Ingrese un dato valido");
                lea.nextLine();
            }
                
                
        }else if (opcion==3){
           
            
            
        
        
        
        }else if (opcion==4){
          
        
    }else if(opcion==5){
            
        }
  }
 }
}
       
    
    

