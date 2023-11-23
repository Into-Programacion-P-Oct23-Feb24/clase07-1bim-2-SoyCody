/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 del estudiante rené
Calificación 7 del estudiante rolando

Promedio de calificaciones: 8,50
 */
package ejemplos02;

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
        String nombre; // *
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        cadenaFinal = "Listado de Notas\n";
        
        
        do {
            
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;
            
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine().toLowerCase();
            System.out.println("Ingrese la nota");
            nota = entrada.nextInt();
            suma = suma + nota;
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();
            cadenaFinal = String.format("%s\nCalificacion %s del estudiante %s", cadenaFinal, nota, nombre );
            if (salida == -111) {
                bandera = false;
            }
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
                               // que se solicita al inicio del ciclo es una
                               // cadena

        } while (bandera); // (bandera==true)
        
        // promedio = suma / contador_calificaciones;
        promedio = (double)suma / contador_calificaciones;
        cadenaFinal = String.format("\n%s\n", cadenaFinal);
        System.out.printf("%s\n", cadenaFinal);
        System.out.printf("Promedio de calificaciones: %s", promedio);
    }
}
