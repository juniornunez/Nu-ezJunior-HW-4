/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuñezjunior_laboratorio2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Junior Nuñes
 */
public class Laboratorio3_juniornunez {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        Random random=new Random();
        int continuar=0;
        
            String opcionesbot;
            
            int bot=0;
            while(continuar!=4){
            System.out.println("***Menu***");
            System.out.println("1.Jugar Piedra, Papel o Tijera");
            System.out.println("2.Suma de digitos");
            System.out.println("3.Patron numericos");
            System.out.print("Que desea realizar?: ");
            continuar=lea.nextInt();
            
                if(continuar==1){
                    
                    while(true){
                    System.out.println("\n **PIEDRA, PAPEL O TIJERA"+
                    "\n Ingrese su opcion (Piedra/Papel/Tijera)");
                    String opciones=lea.next().toLowerCase();
                    bot=random.nextInt(3)+1;
                    
                    if(bot==1){
                    opcionesbot="papel";
                    System.out.println("La maquina eligio: "+opcionesbot);
                        
                    }else if(bot==2){
                    opcionesbot="piedra";
                    System.out.println("La maquina eligio: "+opcionesbot);
                                
                    }else if(bot==3){
                    opcionesbot="tijera";
                    System.out.println("La maquina eligio: "+opcionesbot);
                                
                    }
                    else {
                    System.out.println(".");            
                    }
                    
                    System.out.println("Tu opcion es: "+opciones);
                    
                    if(bot==1&&opciones.equalsIgnoreCase("papel")){
                        System.out.println("Tu has ganado!");
                        
                    }else if(bot==2&&opciones.equalsIgnoreCase("tijera")){
                        System.out.println("Tu has ganado!");
                        
                    }else if(bot==3&&opciones.equalsIgnoreCase("piedra")){
                        System.out.println("Tu has ganado!");
                        
                    }else if(bot==3&&opciones.equalsIgnoreCase("tijera")||bot==2&&opciones.equalsIgnoreCase("papel")||bot==1&&opciones.equalsIgnoreCase("piedra")){
                    System.out.println("Empataste!");
                    
                    }
                    else{
                    System.out.println("perdiste");
                     }
                    
                    System.out.println("Deseas seguir jugando?(Si o No)?");
                    String respuesta=lea.next().toLowerCase();
                    
                    
                    if(respuesta.equals("no")){
                        break;
                        
                    }
                    }
                }
                else if(continuar==2){
                        int entero;
                        int suma=0;
                        String sumaDigitos="";
                        System.out.println("Ingrese digitos enteros");
                        entero=lea.nextInt();
                        
                        String entTexto=Integer.toString(entero);
                        
                        int lon=entTexto.length()-1;
                        
                        for(int contador=0;contador<=lon;contador++){
                            char numchar= entTexto.charAt(contador);
                            
                            int num= Integer.parseInt(Character.toString(numchar));
                            
                            sumaDigitos +=num+"  +  ";
                            suma+=num;
                        }
                        String sumaS= sumaDigitos.substring(0,sumaDigitos.length()-3);
                        System.out.println(sumaS+" = "+suma);
                }        
                        
                        
                        
                else if(continuar==3){   
                         System.out.print("Ingrese el numero de filas que desea:");
                         int fil=lea.nextInt();
                         
                         for(int contp=0;contp<fil;contp++){
                             for(int espacio=0;espacio<contp;espacio++){
                                 System.out.print("  ");  
                             }
                             for(int cont=fil-contp;cont>=1;cont--){
                                 System.out.print(cont+" ");
                             }
                             System.out.println();
                         }
                }else{
                    System.out.println("Salir");
                }        
                         
//                break;
            }
            
                    
                    
                                                                                                                                                                                                                    
                                                    
            
            
            
            
            
            
            }       
        
    }

    
    
    

