/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

import java.util.Scanner;

/**
 *
 * @author daann
 */
public class Familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de familias: ");
        int N = scanner.nextInt();
        
        double sumaTotalMedias = 0.0; // Variable para la suma total de todas las medias
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int M = scanner.nextInt();
            
            int sumaEdades = 0; // Variable para la suma de edades de los hijos de la familia
            
            for (int j = 1; j <= M; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = scanner.nextInt();
                sumaEdades += edad;
            }
            
            double mediaEdadFamilia = (double) sumaEdades / M; // Calcular la media de edad de los hijos de la familia
            sumaTotalMedias += mediaEdadFamilia; // Agregar la media de edad de la familia a la suma total de todas las medias
        }
        
        double mediaEdadTotal = sumaTotalMedias / N; // Calcular la media de edad de todos los hijos de todas las familias
        
        System.out.println("La media de edad de todos los hijos de todas las familias es: " + mediaEdadTotal);
        
        scanner.close();
    }
}