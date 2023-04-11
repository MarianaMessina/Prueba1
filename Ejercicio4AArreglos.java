/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4aarreglos;

import java.util.Random;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta 
 * de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas 
 * por columnas (o viceversa).
 */
public class Ejercicio4AArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] matriz = new int [4][4];
       Random numrandom = new Random();
      
       // llena la matriz con valores aleatorios
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[0].length;j++){
               matriz [i][j] = numrandom.nextInt(10);
           }
       }
       //la imprime
        System.out.println("Matriz original: ");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.printf("[%d]", matriz[i][j]);
            }
            System.out.println();         
        }
        System.out.println("Matriz traspuesta: ");
        int i;
        for(i=0;i<matriz[0].length;i++){
           int j;
            for(j=0;j<matriz.length;j++){
                System.out.printf("[%d]", matriz [j][i]);
            }
            System.out.println();
        }
    }
    
}
