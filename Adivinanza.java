/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanza;

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos 
 * números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
 * es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
 * respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() 
 * de Java.
 */
public class Adivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        int respuesta;
        do {
            // Pedir al usuario que adivine el resultado de la multiplicación
            System.out.print("Adivina el resultado de " + num1 + " x " + num2 + ": ");
            respuesta = sc.nextInt();

            // Verificar si la respuesta es correcta
            if (respuesta == num1 * num2) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto, inténtalo de nuevo.");
            }
        } while (respuesta != num1 * num2);

        sc.close();
    }
}