/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<EstudiantePresencial> estudiantes = new ArrayList<>();
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer del scanner

            EstudiantePresencial presencial = new EstudiantePresencial(n, ap, ced, edad, creditos, costo);
            presencial.calcularMatriculaPresencial();
            estudiantes.add(presencial);
            
            System.out.println("¿Desea ingresar otro estudiante? (si/no)");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
        
        for (EstudiantePresencial estudiante : estudiantes) {
            System.out.printf("%s\n", estudiante);
        }
    }

}
