
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
            try{
            System.out.println("Ingrese su nombre:");
            String nombre = lea.next();

            int canalNormales = 0;
            int canalHD = 0;

            do {
                System.out.println("Ingrese el tipo de canal (HD/NORMAL):");
                String tipoCanal = lea.next().toUpperCase();

                if (tipoCanal.equals("HD")) {
                    canalHD++;
                } else if (tipoCanal.equals("NORMAL")) {
                    canalNormales++;
                } else {
                    System.out.println("Tipo de canal no válido, intente nuevamente.");
                    continue;
                }

                System.out.println("Desea ingresar otro canal? (SI/NO)");
                String respuesta = lea.next().toUpperCase();
                if (!respuesta.equals("SI")) {
                    break;
                }

            } while (true);

            System.out.println("Ingrese el tipo de Caja Digital (1.LIGHTBOX / 2.HDBOX / 3.DVRBOX):");
            int tipoDeCaja = lea.nextInt();
            int costoCaja = 0;

            if (tipoDeCaja==1) {
                costoCaja = 50;
            } else if (tipoDeCaja==2) {
                costoCaja = 100;
            } else if (tipoDeCaja==3) {
                costoCaja = 150;
            } else {
                System.out.println("Tipo de caja no válido.");
                continue;
            }

            int subtotal = (canalNormales * 20) + (canalHD * 30) + costoCaja;
            double impuesto = subtotal * 0.15;
            double total = subtotal + impuesto;

            System.out.println("***FACTURA***");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de canales normales normales: " + canalNormales);
            System.out.println("Cantidad de canales en HD: " + canalHD);
            System.out.println("Subtotal: " + subtotal + " Lps");
            System.out.println("Impuesto (15%): " + impuesto + " Lps");
            System.out.println("Total a pagar: " + total + " Lps");
            }catch(Exception e){
                System.out.println("Ingrese un dato valido");
                lea.nextLine();
            }
            
        
        
        
        }else if (opcion==4){
            
         try {
             
                    System.out.println("Escriba una palabra: ");
                    String palabra = lea.next().toLowerCase();
                    
                    int contvocales = 0;

                    for (int cont = 0; cont <= palabra.length() - 1; cont++) {
                        char vocales = palabra.charAt(cont);

                     switch (vocales) {
                            
                        case 'a':
                            
                          contvocales++;
                          
                             break;
                             
                        case 'e':
                            
                           contvocales++;
                                
                             break;
                             
                        case 'i':
                            
                           contvocales++;
                                
                             break;
                             
                        case 'o':
                            
                           contvocales++;
                           
                             break;
                                
                        case 'u':
                            
                           contvocales++;
                           
                             break;
                                
                        }
                    }

                    System.out.println("Esta palabra contiene un total de "+contvocales+" vocales");
                    
                }catch (Exception e) {
                    System.out.println("Ingrese datos validos");
                    lea.nextLine();
        
        }
    }else if(opcion==5){
            System.out.println("HASTA LUEGOOOO!!! <3");
            break;
            
        }
  }
 }
}
       
    
    

