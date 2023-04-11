/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocal;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class Vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vocal = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        String letra=vocal.nextLine();
        
        if(letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada es una vocal.");
        }else{
                System.out.println("La letra ingresada NO es una vocal.");
                }
    }
    
}
