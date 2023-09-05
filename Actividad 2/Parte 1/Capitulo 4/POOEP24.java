/* Ejercicio propuesto #24
 
Enunciado:
Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso

 */

import java.util.Scanner;

public class POOEP24 {
    public static void main(String[] args) {

        
        double esfera1, esfera2, esfera3;

        System.out.println("Ingrese el peso de la primera esfera: ");
        Scanner entrada1 = new Scanner(System.in);
        esfera1 = entrada1.nextDouble();

        System.out.println("Ingrese el peso de la segunda esfera: ");
        Scanner entrada2 = new Scanner(System.in);
        esfera2 = entrada2.nextDouble();

        System.out.println("Ingrese el peso de la tercera esfera: ");
        Scanner entrada3 = new Scanner(System.in);
        esfera3 = entrada3.nextDouble();

        if ((esfera1 == esfera2) && (esfera2 == esfera3)) {
            System.out.println("Las tres esferas tienen el mismo peso");
        }
        else if ((esfera1 > esfera2) && (esfera1 > esfera3)) {
            System.out.println("La esfera A es la de mayor peso");
        }
        else if ((esfera2 > esfera1) && (esfera2 > esfera3)) {
            System.out.println("La esfera B es la de mayor peso");
        }
        else {
            System.out.println("La esfera C es la de mayor peso");
        }

    }    
}
