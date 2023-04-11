/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un 
 * número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra 
 * repetido
 */
public class Ejercicio2Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random numrandom = new Random();
        int vector [] = new int [99];
        
        System.out.println("¿Que numero desea buscar dentro del vector?");
        int busqueda = num.nextInt();
        
        for(int i=0;i<vector.length;i++){
            vector[i]= numrandom.nextInt(100);
        }
        
        boolean condicion=false; //Sera falso mientras...
        int posicion= -1;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==busqueda){
                if(!condicion){
                    condicion=true;
                    posicion=i;
                }else{
                    System.out.println("El numero "+busqueda+" ,esta repetido en el vector.");
                    break;
                }
            }
        }
        if(condicion){
            System.out.println("El numero "+busqueda+", se encuentra en la posicion del vector:"+posicion);
        }else{
            System.out.println("El numero "+busqueda+", no se encuentra en el vector.");
        }
        
    }
    
}
