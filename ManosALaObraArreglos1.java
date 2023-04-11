/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobraarreglos1;

import java.util.Scanner;

/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
public class ManosALaObraArreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MAO = new Scanner(System.in);
        int compañeros = 8;
        String [] equipo = new String [compañeros];
        System.out.println("Ingrese los nombres de sus compañeros: ");
        for (int i=0; i < compañeros; i++){
             equipo [i] = MAO.nextLine();
        }
       
    }
    
}
