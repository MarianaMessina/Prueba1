/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_una_a;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Substring y equals() 
 * de Java.
 */
public class Es_una_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ejercicio = new Scanner (System.in);
        System.out.println("Ingrese una frase o palabra. El programa verificara si el primer caracter ingresado es una A: ");
        String letra=ejercicio.nextLine();
        if(letra.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("CORRECTO.");
} else {
            System.out.println("INCORRECTO.");
}    
    }
    
}
