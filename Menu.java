/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
 * el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el 
 * menú.
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Ingrese un par de numeros enteros positivos: ");
        int num1=menu.nextInt();
        int num2=menu.nextInt();
        String respuesta="n";
        
        do {
            System.out.println("Bienvenido al menu. Seleccione una de las opciones");
            System.out.println(" ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            int opcion=menu.nextInt();
            switch(opcion){
                
                case 1:
                    System.out.println("El resultado de esta suma es: " +(num1+num2));
                    break;
                case 2:
                    System.out.println("El resultado de esta resta es: " +(num1-num2));
                    break;
                case 3:
                    System.out.println("El resultado de esta multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("El resultado de esta division es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta=menu.next();
                     if (respuesta.equalsIgnoreCase("s")) {
                    break;
                     }
                default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
            }
            }while(respuesta.equalsIgnoreCase("n"));
       
        }
        }

