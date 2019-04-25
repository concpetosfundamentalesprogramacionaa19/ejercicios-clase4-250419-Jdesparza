/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
// Para importar a la biblioteca
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Principal {
    
    public static void main(String[] args) {
        // documentacion
        /*
         * Solucion de Lenguaje Java
         * Empresa de telefonía cobra a sus clientes una tarifa básica de $3 
         * por mes por enviar mensajes de texto.
        */
        
        // importamos a la libreria para poder ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        // ingreso de la calificacion por teclado
        System.out.print("Por favor ingrese la cantidad de mensajes enviados "
                + "este mes: ");
        int mensajes = entrada.nextInt();
        
        /*
         * El SiNo_Entonces sirve en el caso de que no se cumpla la primera
         * condicion entonces utilice la segunda.
        */
        
        // Condicion 1
        if (mensajes <= 40) {
            
            // Formula para saber el costo por los 40 mensajes y se declaran
            // las variables
            double costo = 3;
            double iva = costo * 0.12;
            double costofinal = costo + iva; 
            // Se imprime el costo final y el iva
            System.out.printf("Su costo final es de: $ %.2f\nEl iva de su "
                    + "costo final es: %.2f", costofinal, iva);
        } else {
            if (mensajes > 40 && mensajes <= 200) {
            
                // Formula para saber el costo por mas de 40 mensajes
                // hasta los 200 y se declaran las variables
                double costoadicional = (mensajes - 40) * 0.05;
                double costo = 3 + costoadicional;
                double iva = costo * 0.12;
                double costofinal = costo + iva;
                
                // Se imprime el costo adicional, costo final y el iva 
                System.out.printf("Su costo adicional es de: $ %.2f\nSu costo "
                        + "final es de: $ %.2f\nEl iva de su costo final "
                        + "es: %.2f", costoadicional, costofinal, iva);
            } else {
                if (mensajes > 200) {
            
                    // Formula para saber el costo por mas de 200 mensajes y
                    // se declaran las variables
                    int mensajes1 = mensajes - 200;
                    double costoadicional1 = mensajes1 * 0.10;
                    double costoadicional2 = (mensajes - mensajes1 - 40) * 0.05;
                    double costoadicionalt = costoadicional1 + costoadicional2;
                    double costo = 3 + costoadicionalt;
                    double iva = costo * 0.12;
                    double costofinal = costo + iva;
                    
                    // Se imprime el costo adicional, costo final y el iva 
                    System.out.printf("Su costo adicional es de: $ %.2f\nSu "
                            + "costo final es de: $ %.2f\nEl iva de su costo "
                            + "final es: %.2f", costoadicionalt, costofinal,
                            iva);
                    
                }
            }
        }
    }
}
