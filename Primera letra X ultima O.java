
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
 * lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser 
 * de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser 
 * una O.
 *Las secuencias leídas que respeten el formato se consideran correctas, 
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
* incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
* funciones de Java Substring(), Length(), equals()
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner RS232 = new Scanner(System.in);
        String cadenas;
        int incorrectas = 0;
        int correctas = 0;
        
        do{
            System.out.println("Ingrese una cadena de 5 caracteres(para salir ingrese `&&&&&`): ");
            cadenas=RS232.nextLine();
            if(cadenas.equals("&&&&&")){
            break;
        }
            if (cadenas.length() <= 5 && (cadenas.substring(0, 1).equalsIgnoreCase("X") && (cadenas.substring(cadenas.length()-1, cadenas.length()).equalsIgnoreCase("O")))) {
                System.out.println("Cadena correcta");
            correctas++;
                 } else {
            System.out.println("Cadena incorrecta");
            incorrectas++;
        }
    } while (true);
        System.out.println("El numero de cadenas correctas fue de: " +correctas); 
        System.out.println("El numero de cadenas incorrectas fue de : "+incorrectas);
        }
    }
    
