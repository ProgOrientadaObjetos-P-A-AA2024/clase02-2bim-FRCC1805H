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

        while (bandera) {

            System.out.println("Ingrese el nombre del estudiante");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula ");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese su edad ");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el numero de creditos ");
            int numerocreditos = entrada.nextInt();
            System.out.println("Ingrese el costo de credito ");
            double costoCreditos = entrada.nextDouble();

            EstudiantePresencial EP = new EstudiantePresencial(nombre, apellido,
                    identificacion, edad, costoCreditos, numerocreditos);
            EP.calcularMatriculaPresencial();
            cadena = String.format("%s%s\n",cadena, EP);
            System.out.println("Desea salir, pulse S");
            entrada.nextLine();
            String opcion = entrada.nextLine();

            if (opcion.equals("S")) {
                bandera = false;
            }
        }

        System.out.printf("%s\n", cadena);

    }
}
