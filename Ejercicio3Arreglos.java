/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3arreglos;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void contarDigitos(int[] numeros) {
        int[] contador = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            int cantidadDigitos = String.valueOf(numeros[i]).length();
            
            switch (cantidadDigitos) {
                case 1:
                    contador[0]++;
                    break;
                case 2:
                    contador[1]++;
                    break;
                case 3:
                    contador[2]++;
                    break;
                case 4:
                    contador[3]++;
                    break;
                case 5:
                    contador[4]++;
                    break;
            }
        }
        
        System.out.println("Cantidad de números de 1 dígito: " + contador[0]);
        System.out.println("Cantidad de números de 2 dígitos: " + contador[1]);
        System.out.println("Cantidad de números de 3 dígitos: " + contador[2]);
        System.out.println("Cantidad de números de 4 dígitos: " + contador[3]);
        System.out.println("Cantidad de números de 5 dígitos: " + contador[4]);
    }
    
    public static void main(String[] args) {
        int[] numeros = {1, 23, 456, 7890, 12, 345, 67};
        contarDigitos(numeros);
    }
}
