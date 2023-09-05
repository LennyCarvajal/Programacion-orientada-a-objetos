/* Ejercicio resuelto #15
 
Enunciado:
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso.

 */

import java.util.Scanner;

public class POOER15 {
    public static void main(String[] args) {

        double esfera1, esfera2, esfera3, esfera4;

        System.out.println("Ingrese el peso de la primera esfera: ");
        Scanner entrada1 = new Scanner(System.in);
        esfera1 = entrada1.nextDouble();

        System.out.println("Ingrese el peso de la segunda esfera: ");
        Scanner entrada2 = new Scanner(System.in);
        esfera2 = entrada2.nextDouble();

        System.out.println("Ingrese el peso de la tercera esfera: ");
        Scanner entrada3 = new Scanner(System.in);
        esfera3 = entrada3.nextDouble();

        System.out.println("Ingrese el peso de la cuarta esfera: ");
        Scanner entrada4 = new Scanner(System.in);
        esfera4 = entrada4.nextDouble();

        if ((esfera1 == esfera2) & (esfera1 == esfera3)) {
            if (esfera4 < esfera1) {
                System.out.println("La cuarta esfera es la diferente y tiene un peso menor");
            }
            else {
                System.out.println("La cuarta esfera es la diferente y tiene un peso mayor");
            }

        }
        else if ((esfera1 == esfera2) & (esfera1 == esfera4)) {
            if (esfera3 < esfera1) {
                System.out.println("La tercera esfera es la diferente y tiene un peso menor");
            }
            else {
                System.out.println("La tercera esfera es la diferente y tiene un peso mayor");
            }

            

        }
        else if ((esfera1 == esfera3) & (esfera1 == esfera4)) {
            if (esfera2 < esfera1) {
                System.out.println("La segunda esfera es la diferente y tiene un peso menor");
            }
            else {
                System.out.println("La segunda esfera es la diferente y tiene un peso mayor");
            }

            

        }
        else {
            if (esfera1 < esfera4) {
                System.out.println("La primera esfera es la diferente y tiene un peso menor");
            }
            else {
                System.out.println("La primera esfera es la diferente y tiene un peso mayor");
            }         

        }

    }
}
