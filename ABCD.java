/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.b.c.d;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el 
 * valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores 
 * finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class ABCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int C = 3;
        int D = 8;
        System.out.println("Los valores actuales de nuestras cuatro variables son:");
        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
        System.out.println("D:"+D);
        
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = B;
        
        System.out.println("Una vez intercambiados, los valores son los siguientes:");
        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
        System.out.println("D:"+D);
    }
    
}
