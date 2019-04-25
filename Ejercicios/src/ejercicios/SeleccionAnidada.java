/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
// Para importar a la biblioteca
import java.util.Scanner;
// importamos todo lo que esta en el paquetedos 
import paquetedos.OperacionDos;
/**
 *
 * @author PC
 */
public class SeleccionAnidada {
    
    public static void main(String[] args) {
        // documentacion
        
        // importamos a la libreria para poder ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        // método principal
        String miMensaje1 = OperacionDos.mensaje1;
        String miMensaje2 = OperacionDos.mensaje2;
        
        
        // int calificacion = 50;
        
        // ingreso de las calificaciones por teclado
        System.out.print("Por favor ingrese la calificacion: ");
        int calificacion = entrada.nextInt();
        
        /*
         * El SiNo_Entonces sirve en el caso de que no se cumpla la primera
         * condicion entonces utilice la segunda.
        */
        
        // Condicional 1
        if (calificacion >= 90) {
            // System.out.printf("Usted está aprobado (excelente) con 
            // %d\n", calificacion);
            System.out.printf("%s (excelente) con %d\n", miMensaje1, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                // System.out.printf("Usted está aprobado (muy buena) con 
                // %d\n", calificacion);
                System.out.printf("%s (muy buena) con %d\n", miMensaje1, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                // System.out.printf("Usted está aprobado (regular) con 
                // %d\n", calificacion);
                System.out.printf("%s (regular) con %d\n", miMensaje1, calificacion);
                } else {
                    // System.out.printf("Usted está reprobado con 
                    // %d\n", calificacion);
                    System.out.printf("%s %d\n", miMensaje2, calificacion);
                }
            }
        }
    }
}
