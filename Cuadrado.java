/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado 
 * tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner cuadrado = new Scanner(System.in);
    System.out.println("Ingrese el ancho del cuadrado que desea dibujar: ");
    int lado = cuadrado.nextInt();
    for (int i = 1; i <= lado; i++) { //como en los Para de Pseint
        for (int j = 1; j <= lado; j++) {
            if ((i == 1) || (i == lado)) {
                System.out.print("* ");
            } else if ((j == 1) || (j == lado)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println(""); // Mueve esto fuera del segundo for
    }
}
}

    
