/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar_impar;

import java.util.Scanner;

/**
 *
 * @author daann
 */
public class NumeroPar_Impar {

    /**
     * Crear un programa que dado un número determine si es par o impar.
     * @param args 
     */
    public static void main(String[] args) {
        int num;
        
        Scanner parimpar = new Scanner(System.in);
        
        System.out.println("Ingrese un numero. El programa determinara si este es par o impar, a continuacion: ");
        
       num = parimpar.nextInt();
       
        if (num % 2 == 0) {
        System.out.println("El numero ingresado es par! ");
    } else {
        System.out.println("El numero ingresado es impar! ");
 }
    
    }
}

    
