/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in); //Entrada de datos por teclado
        
        double F, C ;
        
        System.out.println("Ingrese la temperatura deseada en grados Celsius: ");
        C = temperatura.nextDouble();
        
        F = 32 + (9 * C / 5.0);
        
        System.out.println(C+"º grados Celsius, equivalen a: "
                +F+"º grados Fahrenheit.");         
    }
}
