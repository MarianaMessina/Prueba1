/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplode5;

import java.util.Scanner;

/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
 * detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la 
 * cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben 
 * sumarse. Nota: recordar el uso de la sentencia break.
 */
public class MultiploDe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner multiplo =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros deseada, si el numero es multiplo de 5 el programa se detendra: ");
        int num = 0;
        int i = 0;
        int numerosPares= 0;
        int numerosImpares = 0;
        int numLeidos = 0;
        
        while(true){ //el true se utiliza en la condición del ciclo while para indicar que el ciclo se ejecutará de forma continua mientras esa condición sea verdadera.
            //True: garantiza que el ciclo se siga ejecutando hasta que se encuentre un número múltiplo de 5.
            //el ciclo se repite hasta que se alcance una condición de salida.
            num = multiplo.nextInt();
            if (num < 0){
                System.out.println("El numero ingresado es incorrecto. Prueba ingresando otro numero.");
            }else{
                i++;
                numLeidos++;
            } 
            if (num%2==0){
                numerosPares++;
            }else{
                numerosImpares++;
            }
                  if  (num%5==0){
                System.out.println("El numero es multiplo de 5. Por lo tanto el programa ha finalizado.");
                System.out.println("Cantidad de numeros leidos hasta el momento: "+numLeidos);
                System.out.println("Cantidad de numeros pares: "+numerosPares);
                System.out.println("Cantidad de numeros impares: "+numerosImpares);
                break;
                        
            }
            
          
        }
    }
    
}
