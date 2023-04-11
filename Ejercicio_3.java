/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
  Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio_3 {

   
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        
        System.out.println("Ingrese una frase a libre eleccion: ");
        
        String ejercicio=frase.nextLine();
        
        System.out.println("Imprimiendo la frase elegida en mayusculas y minusculas: ");
        System.out.println(ejercicio.toUpperCase());
        System.out.println(ejercicio.toLowerCase());
       
        
    }
    
}
