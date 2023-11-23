/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        cadenaFinal = "Listado de Notas\n";

        do {
            System.out.println("Ingrese calificaciones, solo valor entero");
            nota = entrada.nextInt();

            // agrego valor al acumulador
            suma = suma + nota;
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;

            // agrego valor a la cadena final
            cadenaFinal = String.format("%sCalificación: %d\n",
                    cadenaFinal,
                    nota);
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }

        } while (bandera); // (bandera==true)

        // promedio = suma / contador_calificaciones;
        promedio = (double) suma / contador_calificaciones;
        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
