/* Ejercicio resuelto #7
 
Enunciado:
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.

 */

import java.util.Scanner;

public class POOER7 {
    public static void main(String[] args) {

        double num1, num2;

        System.out.println("Ingrese el primer numero: ");
        Scanner entrada1 = new Scanner(System.in);
        num1 = entrada1.nextDouble();


        System.out.println("Ingrese el segundo numero: ");
        Scanner entrada2 = new Scanner(System.in);
        num2 = entrada2.nextDouble();

        if (num1 == num2) {

            System.out.println(num1 + " es igual a " + num2);

        }
        else if (num1 > num2) {

            System.out.println(num1 + " es mayor que " + num2);

        }
        else {

            System.out.println(num1 + " es menor que " + num2);

        }

    }
}
