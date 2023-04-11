/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase_eureka;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka�? el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java
 */
public class Frase_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase=new Scanner (System.in);
        System.out.println("Introduzca una frase: ");
        
        String contrase�a="eureka";
        String frasesecreta=frase.next();
    
    if(frasesecreta.equalsIgnoreCase("eureka")){
        System.out.println("Correcto!");
} else {
        System.out.println("Incorrecto!");
}    
    
   }
}

    