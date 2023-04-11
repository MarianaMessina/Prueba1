/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrasocial;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de 
* tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos 
* tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
* represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar 
* por dicho socio.
 */
public class ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner OS = new Scanner(System.in);
        int menu = 0;
        int tratamiento = 0;
        System.out.println("Bienvenido. Seleccione la clase de socio se encuentra,a continuacion: ");
        menu = OS.nextInt();
        
        
         while (menu != 0 && tratamiento != 0){
             /*En este caso, es mejor utilizar el ciclo "while" en lugar de "do-while" 
             porque se quiere que el programa primero pregunte al usuario por la clase de socio 
             y luego pida el costo del tratamiento. Con el ciclo "do-while", el programa primero pediría
             el costo del tratamiento antes de preguntar al usuario por la clase de socio, lo cual no es
             lo que se desea en este caso. Con el ciclo "while", se puede asegurar que el programa primero
             pregunte al usuario por la clase de socio antes de pedir el costo del tratamiento.
             */
           
            System.out.println("1.Socios tipo `A`");
            System.out.println("2.Socios tipo `B`");
            System.out.println("3.Socios tipo `C`");
            int opcion = OS.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indique el costo del tratamiento que necesita realizar:");
                    double costo_tratamiento_A= OS.nextDouble();
                    double importe_A= costo_tratamiento_A*0.5;
                            System.out.println("El importe a pagar con el descuento aplicado es de: $"+importe_A); 
                    break;
                case 2:
                    System.out.println("Indique el costo del tratamiento que necesita realizar:");
                    double costo_tratamiento_B= OS.nextDouble();
                    double importe_B= costo_tratamiento_B*0.35;
                    System.out.println("El importe a pagar con el descuento aplicado es de: $"+importe_B);
                    break;
                case 3:
                    System.out.println("Indique el costo del tratamiento que necesita realizar:");
                    double costo_tratamiento_C= OS.nextDouble();
                    System.out.println("Usted se encuentra en la categoria `C`. No tiene ningun descuento, por lo cual el monto a pagar es: $"+costo_tratamiento_C);
                    break;
                    //es necesario agregar una condición en la cual se salga del bucle y finalice la ejecución del programa.
                default:
                System.out.println("La opcion ingresada no es valida.");
                break;
            }
        }
       System.out.println("Fin del programa.");         
    }
}

