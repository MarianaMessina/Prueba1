/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 *Nota: investigar la función Math.sqrt().
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      double numero, raiz;
        System.out.println("A continuacion, ingrese un número: ");
        numero=num.nextInt();
        raiz = Math.sqrt(numero);
        System.out.println("El numero introducido es: "+ numero);
        System.out.println("El doble de este numero es: "+numero*2);
        System.out.println("El triple de este numero es: "+numero*3);
        System.out.println("La raiz cuadrada de este numero es: "+raiz);
        
    }
    
}
