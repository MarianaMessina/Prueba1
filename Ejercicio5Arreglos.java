/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5arreglos;

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A 
 * es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir,
 * A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio5Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};
        boolean esAntisimetrica = esAntisimetrica(matriz);
        System.out.println("Matriz original:");
        int n = matriz.length;
          for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            System.out.printf("[%d]" , matriz[i][j]);
    }
                System.out.println();
}

            System.out.println("Matriz traspuesta:");
              for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  System.out.printf("[%d]" , matriz[j][i]);
                 }
               System.out.println();
}
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
    private static boolean esAntisimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
