/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprograma1;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
 * y deben devolver sus resultados para imprimirlos en el main. 
 */
public class Subprograma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calculadora = new Scanner (System.in);
        
        System.out.println("Bienvenido usuario. ¿Que operacion desea ejecutar? Seleccione el numero que corresponda: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
         int eleccion = calculadora.nextInt();
         
          if (eleccion<1 || eleccion>4){
                   System.out.println("La opcion ingresada no es valida. Intente nuevamente.");
                   return;
                   }
                   
         System.out.println("Ingrese el primer numero: ");
         double num1=calculadora.nextDouble();
         System.out.println("Ingrese el segundo numero: ");
         double num2=calculadora.nextDouble();
         
         double resultado = 0;
         
         switch(eleccion){
             case 1:
                 resultado = sumar(num1, num2);
                         break;
             case 2:
                 resultado = restar(num1, num2);
                 break;
             case 3:
                 resultado = multiplicar(num1, num2);
                 break;
             case 4:
                 resultado = dividir(num1, num2);
                 break;
            
                 }
           
         System.out.println("El resultado de la operacion elegida es: "+resultado);
    }
    public static double sumar (double num1, double num2){
        return num1 + num2;
    }
    public static double restar (double num1, double num2){
        return num1-num2;
    }
    public static double multiplicar (double num1, double num2){
        return num1 * num2;
    }
    public static double dividir (double num1, double num2){
        return num1/num2;
    }
}
