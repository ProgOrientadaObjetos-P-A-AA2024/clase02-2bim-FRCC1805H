/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        boolean bandera = true;
        String cadena = "";
        
        while(bandera){
           
            
            System.out.println("Ingrese el nombre del estudiante");
            String n = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            String a = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula ");
            String i = entrada.nextLine();
            System.out.println("Ingrese su edad ");
            int ed = entrada.nextInt();
            System.out.println("Ingrese el numero de creditos ");
            int nc = entrada.nextInt();
            System.out.println("Ingrese el costo de credito ");
            double c = entrada.nextDouble();
            entrada.nextLine();
            cadena = String.format("%s\n%s\n%s\n%s\n%d\n%d\n%.2f\n", cadena, n,a,i,ed,nc,c);
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            entrada.nextLine();
            if(opcion.equals("S")){
                bandera = false;
            }
        }
        
         System.out.printf("%s\n", cadena);
        
        
    }
}




