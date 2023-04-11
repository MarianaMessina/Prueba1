/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobrasubprograma2;

import java.util.Scanner;

/**
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son
 */
public class ManosALaObraSubprograma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner multiplo = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = multiplo.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = multiplo.nextInt();
        if (esMultiplo(num1, num2)) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }

    public static boolean esMultiplo(int num1, int num2) {
        return num1 % num2 == 0;
    }
}

