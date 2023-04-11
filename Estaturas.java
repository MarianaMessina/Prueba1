/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaturas;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
 * por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner estatura = new Scanner(System.in);
        //variables necesarias para guardar la altura de cada persona, el número total de personas y los promedios que se van a calcular.
        double altura, sumaTotal = 0, sumaBajo160 = 0;
        int n, contadorTotal = 0, contadorBajo160 = 0;
        System.out.println("Ingrese la cantidad de personas que desea promediar: ");
        n = estatura.nextInt ();
        
        for(int i=1;i<=n;i++){
            System.out.println("Ingrese la altura de la persona "+i+" en centimetros");
            altura=estatura.nextDouble();
            sumaTotal += altura;
            contadorTotal++;
            if(altura < 1.60){
                sumaBajo160 += altura;
                contadorBajo160++;
            }
        }
        double promedioTotal = sumaTotal / contadorTotal;
        double promedioBajo160 = sumaBajo160 / contadorBajo160;
        System.out.println("El promedio de estaturas en general es: " + promedioTotal + " metros");
        System.out.println("El promedio de estaturas por debajo de 1.60 mts. es: " + promedioBajo160 + " metros");

    }
    
}
