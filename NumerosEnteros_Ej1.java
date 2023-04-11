/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosenteros_ej1;

import java.util.Scanner;

/**
 *
 * @author daann
 */
public class NumerosEnteros_Ej1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int sumaTotal;

        Scanner operacion = new Scanner(System.in); //Ingreso de datos
        
        System.out.println("Ingrese los numeros que desee sumar: ");//texto
        
        numero1 = operacion.nextInt();//va a recibir un nºentero de la consola
     
        numero2 = operacion.nextInt();//almacenara el segundo numero
        
        sumaTotal = numero1 + numero2;
        
        System.out.println("La suma de los valores ingresados es de: " + sumaTotal);
    }
    
}
