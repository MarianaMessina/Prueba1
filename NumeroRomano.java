/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroromano;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
public class NumeroRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner romano = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10: ");
        int num = romano.nextInt();
        // Ahora verificamos si el número es válido
        if(num<1 || num>10){// si num es menor que 1 O mayor que 10
            System.out.println("El numero ingresado no es valido.");
        }else{
            //Ahora determinamos el valor de los numeros en romano.
            String numRomano = "";
            if(num==1){
                numRomano = "I";
            }else if(num==2){
                 numRomano = "II";       
            }else if(num==3){
                numRomano= "III";
            }else if(num==4){
                numRomano= "IV";
            }else if(num==5){
                numRomano="V";
            }else if(num==6){
                numRomano="VI";
            }else if(num==7){
                numRomano="VII";
            }else if(num==8){
                numRomano="VIII";
            }else if(num==9){
                numRomano="IX";
            }else if (num==10){
                numRomano="X";
            }
            System.out.println("El numero ingresado, expresado en romanos es:" +numRomano);
        }
        
    }
    
}
