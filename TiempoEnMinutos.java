/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempoenminutos;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
 * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class TiempoEnMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tiempo = new Scanner(System.in);
        System.out.println("Ingrese los minutos que desee calcular en dias y horas: ");
        int minutos = tiempo.nextInt();
        
        int horas = minutos/60;
        int dias = horas/24;
        int tiemporestante = horas % 24;
        System.out.println(minutos+ ",minutos equivalen a: " +horas+" horas y, "+dias+" dias.");
    }
    
}
