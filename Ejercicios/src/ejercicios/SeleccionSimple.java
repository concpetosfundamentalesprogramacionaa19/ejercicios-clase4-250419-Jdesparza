/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
// Para importar a la biblioteca
import java.util.Scanner;
// importamos todo lo que esta en el paquetedos 
import paquetedos.*;
/**
 *
 * @author PC
 */
public class SeleccionSimple {
    
    public static void main(String[] args) {
        // documentacion
        
        // importamos a la libreria para poder ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        // método principal
        String miMensaje = Operacion.mensaje;
        
         // int calificacion = 85;
         
        // ingreso de la calificacion por teclado
        System.out.print("Por favor ingrese la primera calificacion: ");
        int calificacion = entrada.nextInt();
        
        System.out.print("Por favor ingrese la segunda calificacion: ");
        int calificacion_2 = entrada.nextInt();
        
        /*
         * El Si_Entonces sirve para imprimir un mensaje solamente cuando se
         * cumpla la condicion dada
        */
        // Condicion 1
        if (calificacion >= 85) {
            // System.out.printf("Usted está aprobado con %d\n", calificacion);
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        
        // int calificacion_2 = 45;
        
        // Condicion 2
        if (calificacion_2 >= 85){
            // System.out.printf("Usted está aprobado con %d\n",calificacion_2);
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }
    }
}
