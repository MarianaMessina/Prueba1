/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobrasubprograma1;

import java.util.Scanner;

/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un 
 */
public class ManosALaObraSubprograma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner codigo = new Scanner(System.in);
        System.out.println("Ingrese una frase a eleccion: ");
        String ingreso=codigo.nextLine();
        String resultado=vocales(ingreso,"");
        System.out.println("La frase codificada se ve asi:" +resultado);
   
        }
    
    public static String vocales (String frase, String resultado){
           for(int i=0;i<frase.length();i++){
           char cambioVocal=frase.charAt(i);

         switch (cambioVocal){
           case 'a':
            resultado += "@";
               break;
           case 'e':
            resultado += "#";
               break;
           case 'i':
           resultado += "$";
               break;
           case 'o':
           resultado += "%";
              break;
           case 'u':
           resultado += "*";
              break;
              default:
           resultado += cambioVocal;
               break;
            }
        }
          return resultado;
    }
}

