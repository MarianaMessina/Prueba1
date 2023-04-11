/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner nombre=new Scanner (System.in); //Scanner para usar el teclado
          //System.in=Entrada de datos
        System.out.println(" Ingrese su nombre: ");
        //System.out=Salida de datos
        String name=nombre.nextLine();
        /*name=variable x 
        *Si solo pongo next solo lee una cadena, en este caso un solo nombre.
        *nextLine lee todo lo introducido
        */
        System.out.println("Bienvenido/a, " +name+ "!");
        //Se concatena la variable name
        
        
     
    }
    
}
