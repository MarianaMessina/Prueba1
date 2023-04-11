/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturanumenteros;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
 * Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad 
 * de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de 
 * tipo entero truncan los números o resultados.
 */
public class LecturaNumEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numEntero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = numEntero.nextInt();
        
        int digitos = 0;
        while (num != 0){
            num /= 10;
            digitos++;

        }
        System.out.println("El numero tiene, "+digitos+ ",digitos en total");
    }
    
}
