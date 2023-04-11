/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor_max_y_min;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
 * de n números (n>0). El valor de n se solicitará al principio del programa y los números serán 
 * introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y 
 * otra con el bucle “do - while”.
 */
public class Valor_Max_y_Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de números que desea introducir: ");
    int n = entrada.nextInt();
    double[] numeros = new double[n];//Usamos decimales porque el promedio no sera exacto/ [n]: longitud de elementos
    int i = 0;//iniciamos un contador i en cero y lo incrementamos en uno en cada iteración.
    while (i < n) {
        System.out.print("Ingrese el número " + (i+1) + ": ");
        numeros[i] = entrada.nextDouble();
        i++;
    }

    double maximo = numeros[0];
    double minimo = numeros[0];
    double suma = 0;
//Para calcular el valor máximo y mínimo, podemos usar un bucle for para comparar 
//cada número en el arreglo con los valores previamente almacenados en las variables maximo y minimo. 
    for (int j = 0; j < n; j++) {
        if (numeros[j] > maximo) {
            maximo = numeros[j];
        }
        if (numeros[j] < minimo) {
            minimo = numeros[j];
        }
        suma += numeros[j];
    }

    double promedio = suma / n;

    System.out.println("El valor máximo es: " + maximo);
    System.out.println("El valor mínimo es: " + minimo);
    System.out.println("El promedio es: " + promedio);
}

}