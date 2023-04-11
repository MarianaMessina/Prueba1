/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra;

import java.util.Scanner;

/**
 *
 * @author daann
 */
public class ManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String dia;
        
        System.out.println("¿Como esta el clima el dia de hoy?:");
        
        dia = leer.next();
        
        System.out.println("Por lo que puedo ver, el dia de hoy esta " + dia + ", que alegria!");
        
    }
    
}
