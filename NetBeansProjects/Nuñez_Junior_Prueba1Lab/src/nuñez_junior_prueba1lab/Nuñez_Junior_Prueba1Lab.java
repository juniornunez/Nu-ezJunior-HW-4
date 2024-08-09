/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_prueba1lab;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_Prueba1Lab {

   

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        
        int contpalreves=0;
        int contnumperfecto=0;
        int contnumprimo=0;
        int contvotaciones=0;
        
        
        

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
                    contpalreves++;
                    System.out.println("Ingrese una palabra");
                    String palabrita = lea.next();

                    for (int i = palabrita.length() - 1; i >= 0; i--) {
                        System.out.print(palabrita.charAt(i));
                    }
                    System.out.println(); 
                    break;

                case 2:
                    contnumperfecto++;
                    System.out.println("Favor ingrese el numero al que desea evaluar: ");
                    int num = lea.nextInt();
                    int suma = 0;

                    for (int cont = 1; cont < num; cont++) {
                        if (num % cont == 0) {
                            suma += cont;
                        }
                    }

                    if (suma == num) {
                        System.out.println("El numero es perfecto");
                    } else {
                        System.out.println("El numero no es perfecto.");
                    }
                    break;

                case 3:
                    contnumprimo++;
                    int bot = random.nextInt(100);
                    System.out.println("Número generado: " + bot);

                    int contador = 1;
                    int primo = 0;

                    while (contador <= bot) {
                        if (bot % contador == 0) {
                            primo += contador;
                        }
                        contador++;
                    }

                    if (primo == bot + 1) {
                        System.out.println("Es primo");
                        System.out.println("Sus únicos divisores son: 1 y " + bot);
                    } else {
                        System.out.println("No es primo");
                    }
                    break;
                 
                case 4:
                    contvotaciones++;
                    int votoazul = 0;
                    int votorojo = 0;
                    int votonegro = 0;
                    int votoamarillo = 0;
                    int votonulo = 0;

                    System.out.println("Ingrese cuantos votantes hay en el país: ");
                    int cantvotantes = lea.nextInt();

                    for (int cont = 0; cont < cantvotantes; cont++) {
                        System.out.println("\n TIPO DE VOTOS" +
                                "\n1. VOTO AZUL" +
                                "\n2. VOTO ROJO" +
                                "\n3. VOTO NEGRO" +
                                "\n4. VOTO AMARILLO");
                        System.out.println("Ingrese su tipo de voto: ");
                        int votos = lea.nextInt();

                        if (votos != 1 && votos != 2 && votos != 3 && votos != 4) {
                            System.out.println("VOTO NULO");
                            votonulo++;
                        } else if (votos == 1) {
                            votoazul++;
                        } else if (votos == 2) {
                            votorojo++;
                        } else if (votos == 3) {
                            votonegro++;
                        } else {
                            votoamarillo++;
                        }
                    }

                    int totalvotos = votoazul + votorojo + votonegro + votoamarillo + votonulo;
                    int votosvalidos = totalvotos - votonulo;

                    if (votosvalidos >= 0.6 * totalvotos) {
                        if (votoazul > votorojo && votoazul > votonegro && votoazul > votoamarillo) {
                            System.out.println("La planilla ganadora es AZUL.");
                        } else if (votorojo > votoazul && votorojo > votonegro && votorojo > votoamarillo) {
                            System.out.println("La planilla ganadora es ROJA.");
                        } else if (votonegro > votoazul && votonegro > votorojo && votonegro > votoamarillo) {
                            System.out.println("La planilla ganadora es NEGRA.");
                        } else {
                            System.out.println("La planilla ganadora es AMARILLA.");
                        }
                    } else {
                        System.out.println("VOTACION FALLIDA");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Numero de ingresos a Palabra alreves: "+ contpalreves);
                    System.out.println("Numero de ingresos a Numero Perfecto: "+contnumperfecto);
                    System.out.println("Numero de ingresos a Primos: "+contnumprimo);
                    System.out.println("Numero de ingresos a Votaciones: "+ contvotaciones);
                    
                    return; 

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
