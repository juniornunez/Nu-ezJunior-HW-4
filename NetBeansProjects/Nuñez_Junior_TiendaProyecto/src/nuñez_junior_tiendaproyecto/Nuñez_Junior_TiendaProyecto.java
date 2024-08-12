 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuñez_junior_tiendaproyecto;

import java.util.Scanner;

/**
 *
 * @author Junior Nuñes
 */
public class Nuñez_Junior_TiendaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner lea = new Scanner(System.in);
        boolean continuar = true;
        double monto = 0;
        double montoInicial = 0; 
        String tipocliente = "";
        int codigoventa = 0;
        int azucarKg = 0;
        int avenaKg = 0;
        int trigoKg = 0;
        int maizKg = 0;
        boolean seHaComprado = false;

        
        int numeroCompras = 0;
        int numeroVentas = 0;
        int cantidadAzucarVendida = 0;
        int cantidadAvenaVendida = 0;
        int cantidadTrigoVendida = 0;
        int cantidadMaizVendida = 0;

        double volumenTotalCompras = 0;
        double volumenTotalVentas = 0;
        double mayorGananciaVenta = 0;
        double mayorGastoCompra = 0;

        String productoMayorGanancia = "";
        String productoMayorGasto = "";

        
        
        while (continuar) {
            System.out.println("OPCIONES");
            System.out.println("1- Abrir Caja");
            System.out.println("2- Cerrar programa");
            System.out.print("Ingrese su opción: ");
            int opcion = lea.nextInt();

            
            
            if (opcion == 1) {
                boolean continuarCaja = true;

                
                while (monto <= 0) {
                    System.out.print("Por favor, ingrese el monto inicial para abrir la caja: ");
                    monto = lea.nextDouble();
                    montoInicial = monto; 

                    if (monto <= 0) {
                        System.out.println("Monto inválido. Intente nuevamente.");
                    }
                }

                
                
                System.out.println("Monto inicial ingresado: " + monto + " Lps");

                
                while (continuarCaja) {
                    System.out.println("Ingrese su opción: ");
                    System.out.println("1- Ingresar monto");
                    System.out.println("2- Ventas");
                    System.out.println("3- Compras");
                    System.out.println("4- Reportes");
                    System.out.println("5- Cerrar Caja");
                    int opcionCaja = lea.nextInt();

                    
                    
                    if (opcionCaja == 1) {
                        System.out.print("Ingrese el monto que desea ingresar: ");
                        double ingreso = lea.nextDouble();
                        monto += ingreso;
                        System.out.println("Monto ingresado: " + ingreso + " Lps. Monto total: " + monto + " Lps");

                        
                        
                    } else if (opcionCaja == 2) {
                        if (!seHaComprado) {
                            System.out.println("No puede realizar ventas sin haber comprado productos primero.");
                            
                            
                        } else {
                            boolean continuarVentas = true;
                            double subtotal = 0;
                            String detalleFactura = "";
                            

                            while (continuarVentas) {
                                System.out.println("Ventas");
                                System.out.println("Ingrese el tipo de cliente: \n"
                                        + "Cliente de tipo a\n"
                                        + "Cliente de tipo b\n"
                                        + "Cliente de tipo c");
                                tipocliente = lea.next().toLowerCase();
                                

                                if (tipocliente.equals("a") || tipocliente.equals("b") || tipocliente.equals("c")) {
                                    System.out.println("Lista de productos disponibles para su tipo de cliente:");
                                    
                                    
                                    if (tipocliente.equals("a")) {
                                        System.out.println("1       Azúcar        30 Lps   Stock: " + azucarKg + " kg");
                                        System.out.println("2       Avena         25 Lps   Stock: " + avenaKg + " kg");
                                        System.out.println("3       Trigo         32 Lps   Stock: " + trigoKg + " kg");
                                        System.out.println("4       Maíz          20 Lps   Stock: " + maizKg + " kg");
                                        
                                        
                                    } else if (tipocliente.equals("b")) {
                                        System.out.println("1       Azúcar        30 Lps   Stock: " + azucarKg + " kg");
                                        System.out.println("2       Avena         25 Lps   Stock: " + avenaKg + " kg");
                                        System.out.println("3       Trigo         32 Lps   Stock: " + trigoKg + " kg");
                                        
                                        
                                    } else if (tipocliente.equals("c")) {
                                        System.out.println("4       Maíz          20 Lps   Stock: " + maizKg + " kg");
                                        
                                        
                                    }

                                    System.out.print("Ingrese el código del producto que desea comprar: ");
                                    codigoventa = lea.nextInt();
                                    
                                    

                                    if ((tipocliente.equals("a") && (codigoventa >= 1 && codigoventa <= 4))
                                            || (tipocliente.equals("b") && (codigoventa >= 1 && codigoventa <= 3))
                                            || (tipocliente.equals("c") && codigoventa == 4)) {

                                        
                                        int cantidadKg = 0;
                                        double precio = 0;
                                        String producto = "";

                                        if (codigoventa == 1) {
                                            producto = "Azúcar";
                                            precio = 30;
                                            
                                            
                                            System.out.print("¿Cuántos kg de Azúcar desea comprar? ");
                                            cantidadKg = lea.nextInt();
                                            
                                            
                                            if (cantidadKg > azucarKg) {
                                                System.out.println("No hay suficiente stock de Azúcar.");
                                                continue;
                                            }

                                            
                                            
                                            azucarKg -= cantidadKg;
                                            cantidadAzucarVendida += cantidadKg;
                                        } else if (codigoventa == 2) {
                                            producto = "Avena";
                                            precio = 25;
                                            System.out.print("¿Cuántos kg de Avena desea comprar? ");
                                            cantidadKg = lea.nextInt();
                                            
                                            

                                            if (cantidadKg > avenaKg) {
                                                System.out.println("No hay suficiente stock de Avena.");
                                                continue;
                                            }

                                            avenaKg -= cantidadKg;
                                            cantidadAvenaVendida += cantidadKg;

                                        } else if (codigoventa == 3) {
                                            producto = "Trigo";
                                            precio = 32;
                                            System.out.print("¿Cuántos kg de Trigo desea comprar? ");
                                            cantidadKg = lea.nextInt();

                                            if (cantidadKg > trigoKg) {
                                                System.out.println("No hay suficiente stock de Trigo.");
                                                continue;
                                            }

                                            trigoKg -= cantidadKg;
                                            cantidadTrigoVendida += cantidadKg;

                                            
                                            
                                        } else if (codigoventa == 4) {
                                            producto = "Maíz";
                                            precio = 20;
                                            System.out.print("¿Cuántos kg de Maíz desea comprar? ");
                                            cantidadKg = lea.nextInt();

                                            
                                            
                                            if (cantidadKg > maizKg) {
                                                System.out.println("No hay suficiente stock de Maíz.");
                                                continue;
                                            }

                                            
                                            
                                            maizKg -= cantidadKg;
                                            cantidadMaizVendida += cantidadKg;
                                        }

                                        
                                        
                                        double totalProducto = precio * cantidadKg;
                                        subtotal += totalProducto;
                                        detalleFactura += cantidadKg + " kg de " + producto + " a " + precio + " Lps/kg = " + totalProducto + " Lps\n";

                                        
                                        
                                        
                                        if (totalProducto > mayorGananciaVenta) {
                                            mayorGananciaVenta = totalProducto;
                                            productoMayorGanancia = producto;
                                        }

                                        
                                        volumenTotalVentas += totalProducto;
                                        numeroVentas++;

                                        
                                        
                                        System.out.print("¿Desea continuar comprando? 1=si, 2=no: ");
                                        int continuarComprando = lea.nextInt();
                                        if (continuarComprando != 1) {
                                            continuarVentas = false;
                                        }

                                        
                                        
                                    } else {
                                        System.out.println("Código de producto inválido para su tipo de cliente.");
                                    }

                                    
                                } else {
                                    System.out.println("Tipo de cliente inválido.");
                                }
                            }

                            
                            
                            System.out.println("--------------------------------------");
                            System.out.println("\n--- Facturación ---");
                            System.out.println(detalleFactura);
                            System.out.println("Subtotal: " + subtotal + " Lps");

                            
                            
                            double descuento = 0;
                            if (subtotal >= 5000) {
                                descuento = subtotal * 0.10;

                                
                                
                            } else if (subtotal >= 1000) {
                                descuento = subtotal * 0.05;
                            }

                            
                            
                            System.out.println("Descuento: " + descuento + " Lps");

                            
                            double subtotalConDescuento = subtotal - descuento;
                            double impuesto = subtotalConDescuento * 0.07;
                            System.out.println("Impuesto (7%): " + String.format("%.2f", impuesto) + " Lps");

                            
                            double totalPagar = subtotalConDescuento + impuesto;
                            System.out.println("Total a pagar: " + totalPagar + " Lps");

                            
                            
                            System.out.println("--------------------------------------");
                            monto += totalPagar;
                            System.out.println("Monto en caja actualizado: " + monto + " Lps");
                            System.out.println(" ");
                        }

                        
                        
                    } else if (opcionCaja == 3) {
                        System.out.println("Compras");
                        System.out.println("Ingrese el tipo de proveedor que desea comprar. (Proveedor A, Proveedor B o Proveedor C)");
                        String proveedor = lea.next().toLowerCase();

                        
                        
                        int cantidadKg = 0;
                        double total = 0;
                        boolean compraRealizada = false;
                        int comprarsi = 0;  

                        
                        
                        if (proveedor.equals("a")) {
                            System.out.println("\nEl proveedor A ofrece: "
                                    + "\nCodigo      Producto        Precio "
                                    + "\n  1          Azucar          25 Lps"
                                    + "\n  4          Maiz            18 Lps");

                            
                            
                            System.out.print("Ingrese el código del producto que desea comprar: ");
                            comprarsi = lea.nextInt();  // Asigna valor a la variable
                            System.out.print("¿Cuántos KG desea comprar? ");
                            cantidadKg = lea.nextInt();

                            
                            if (comprarsi == 1) {
                                total = cantidadKg * 25;
                                if (monto >= total) {
                                    azucarKg += cantidadKg;
                                    compraRealizada = true;
                                    
                                    
                                }
                            } else if (comprarsi == 4) {
                                total = cantidadKg * 18;
                                
                                if (monto >= total) {
                                    maizKg += cantidadKg;
                                    compraRealizada = true;
                                    
                                }

                            } else {
                                System.out.println("Código de producto inválido.");
                                continue;
                                
                                
                            }

                            
                        } else if (proveedor.equals("b")) {
                            System.out.println("\nEl proveedor B ofrece: "
                                    + "\nCodigo      Producto        Precio"
                                    + "\n  2          Avena           20 Lps"
                                    + "\n  3          Trigo           30 Lps");
                            System.out.print("Ingrese el código del producto que desea comprar: ");
                            comprarsi = lea.nextInt();
                            
                            System.out.print("¿Cuántos KG desea comprar? ");
                            cantidadKg = lea.nextInt();
                            

                            if (comprarsi == 2) {
                                total = cantidadKg * 20;
                                
                                if (monto >= total) {
                                    avenaKg += cantidadKg;
                                    compraRealizada = true;
                                }

                                
                                
                            } else if (comprarsi == 3) {
                                total = cantidadKg * 30;
                                

                                if (monto >= total) {
                                    trigoKg += cantidadKg;
                                    compraRealizada = true;
                                    
                                }

                            } else {
                                System.out.println("Código de producto inválido.");
                                continue;
                            }
                            
                            

                        } else if (proveedor.equals("c")) {
                            System.out.println("\nEl proveedor C ofrece: "
                                    + "\nCodigo      Producto        Precio"
                                    + "\n  2          Avena           22 Lps");
                            System.out.print("Ingrese el código del producto que desea comprar: ");
                            comprarsi = lea.nextInt();
                            
                            System.out.print("¿Cuántos KG desea comprar? ");
                            cantidadKg = lea.nextInt();

                            
                            
                            if (comprarsi == 2) {
                                total = cantidadKg * 22;
                                if (monto >= total) {
                                    avenaKg += cantidadKg;
                                    compraRealizada = true;
                                    
                                    
                                }

                            } else {
                                System.out.println("Código de producto inválido.");
                                continue;
                                
                                
                            }

                        } else {
                            System.out.println("Proveedor no válido.");
                            continue;
                        }

                        
                        
                        if (compraRealizada) {
                            System.out.print("¿Desea efectuar la compra por " + total + " Lps? (si/no): ");
                            String confirmar = lea.next().toLowerCase();
                            
                            

                            if (confirmar.equals("si")) {
                                monto -= total;
                                volumenTotalCompras += total;
                                numeroCompras++;

                                
                                
                                
                                if (total > mayorGastoCompra) {
                                    mayorGastoCompra = total;
                                    productoMayorGasto = (comprarsi == 1) ? "Azúcar" : (comprarsi == 2) ? "Avena" : "Maíz";
                                }

                                seHaComprado = true;
                                System.out.println("Compra realizada. Su monto actual es de: " + monto + " Lps.");

                                
                                
                            } else {
                                System.out.println("Compra cancelada.");
                            }

                            
                            
                        } else {
                            System.out.println("No tienes suficiente dinero para realizar la compra.");
                        }

                        
                        
                    } else if (opcionCaja == 4) {
                        if (!seHaComprado && numeroVentas == 0) {
                            System.out.println("Debe realizar al menos una compra o venta antes de generar reportes.");
                        } else {

                            
                            System.out.println("------------------------------------------------");
                            System.out.println("--- REPORTES ---");
                            System.out.println("  ");
                            System.out.println("A. Cantidad Actual en Caja: " + String.format("%.2f",monto) + " Lps");
                            System.out.println("   ");
                            System.out.println("B. Número de Compras realizadas: " + numeroCompras);
                            System.out.println("   Número de Ventas realizadas: " + numeroVentas);
                            System.out.println("   ");
                            System.out.println("C. Volumen total de Compras: " + volumenTotalCompras + " Lps");
                            System.out.println("   Volumen total de Ventas: " + volumenTotalVentas + " Lps");
                            
                            
                            
                            double margenGanancia = volumenTotalVentas - volumenTotalCompras;
                            System.out.println("   Margen de ganancia: " + margenGanancia + " Lps");
                            System.out.println("   ");
                            
                            
                            double promedioCompra = (numeroCompras > 0) ? volumenTotalCompras / numeroCompras : 0;
                            double promedioVenta = (numeroVentas > 0) ? volumenTotalVentas / numeroVentas : 0;

                            System.out.println("d. Valor Medio de Compra: " + String.format("%.2f", promedioCompra) + " Lps");
                            System.out.println("   Valor Medio de Venta: " + String.format("%.2f", promedioVenta) + " Lps");
                            
                            System.out.println("   ");
                            System.out.println("E. Venta con Mayor Ganancia: " + mayorGananciaVenta + " Lps (Producto: " + productoMayorGanancia + ")");
                            System.out.println("   Compra con Mayor Gasto: " + mayorGastoCompra + " Lps (Producto: " + productoMayorGasto + ")");

                            
                            
                            String productoEstrella = "";
                            int cantidadEstrella = 0;

                            
                            
                            if (cantidadAzucarVendida > cantidadEstrella) {
                                cantidadEstrella = cantidadAzucarVendida;
                                productoEstrella = "Azúcar";
                            }

                            
                            
                            if (cantidadAvenaVendida > cantidadEstrella) {
                                cantidadEstrella = cantidadAvenaVendida;
                                productoEstrella = "Avena";
                            }

                            
                            
                            if (cantidadTrigoVendida > cantidadEstrella) {
                                cantidadEstrella = cantidadTrigoVendida;
                                productoEstrella = "Trigo";
                            }

                            
                            
                            if (cantidadMaizVendida > cantidadEstrella) {
                                cantidadEstrella = cantidadMaizVendida;
                                productoEstrella = "Maíz";
                            }

                            
                            System.out.println("  ");
                            System.out.println("F. Producto Estrella: " + productoEstrella + " (" + cantidadEstrella + " kg vendidos)");

                            
                            System.out.println("   ");
                            System.out.println("G. Ranking de Productos Más Vendidos:");
                            System.out.println(productoEstrella + ": " + cantidadEstrella + " kg");

                            
                            
                            if (!productoEstrella.equals("Azúcar") && cantidadAzucarVendida > 0)
                                System.out.println("Azúcar: " + cantidadAzucarVendida + " kg");

                            
                            
                            if (!productoEstrella.equals("Avena") && cantidadAvenaVendida > 0)
                                System.out.println("Avena: " + cantidadAvenaVendida + " kg");

                            
                            if (!productoEstrella.equals("Trigo") && cantidadTrigoVendida > 0)
                                System.out.println("Trigo: " + cantidadTrigoVendida + " kg");

                            
                            if (!productoEstrella.equals("Maíz") && cantidadMaizVendida > 0)
                                System.out.println("Maíz: " + cantidadMaizVendida + " kg");

                            
                            
                            System.out.println("\n--- Fin del Reporte ---"+
                                    "\n     ");
                            System.out.println("------------------------------------------------");
                        }

                        
                        
                    } else if (opcionCaja == 5) {
                        

                        
                         double gananciaDia = monto - montoInicial;
                         System.out.println("Ganancia del día: " + String.format("%.2f", gananciaDia) + " Lps");

                         System.out.println("Monto total en caja: " + String.format("%.2f", monto) + " Lps");

                        
                        
                        double maximoDepositar = monto * 0.60;
                        System.out.println("Puede depositar hasta " + String.format("%.2f", maximoDepositar) + " Lps en el banco.");


                        
                        double deposito;
                        
                        do {
                            System.out.print("Ingrese la cantidad que desea depositar en el banco: ");
                            deposito = lea.nextDouble();

                            
                            
                            if (deposito > maximoDepositar) {
                                System.out.println("No puede depositar más del 60% del efectivo en caja. Intente nuevamente.");
                            }
                        } while (deposito > maximoDepositar);
                        

                      
                        monto -= deposito;
                        System.out.println("Depósito realizado. Cantidad en caja para el siguiente día: " + String.format("%.2f", monto) + " Lps");


                        
                        
                        continuarCaja = false;
                        System.out.println("Cerrando caja y volviendo al menú principal.");

                        
                        
                    } else {
                        System.out.println("Opción inválida, intente nuevamente.");
                    }
                }

                
                
            } else if (opcion == 2) {
                continuar = false;
                System.out.println("Saliendo del sistema...");
                
                
            } else {
                System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }
}
