/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocienteresiduo;

import java.util.Scanner;

/**
 *Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un 
 * algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del 
 * divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número 
 * de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
public class CocienteResiduo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = entrada.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = entrada.nextInt();//lectura

        int contador = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            contador++;
        }

        System.out.println("El cociente es: " + contador);
        System.out.println("El residuo es: " + residuo);
    }
}
    

