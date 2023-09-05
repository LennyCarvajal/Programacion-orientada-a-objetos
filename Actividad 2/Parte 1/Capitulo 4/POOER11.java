/* Ejercicio resuelto #11
 
Enunciado:
Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos.

 */

import java.util.Scanner;

public class POOER11 {
    public static void main(String[] args) {

        int num1, num2, num3, mayor = 0;

        System.out.println("Ingrese el primer numero: ");
        Scanner entrada1 = new Scanner(System.in);
        num1 = entrada1.nextInt();


        System.out.println("Ingrese el segundo numero: ");
        Scanner entrada2 = new Scanner(System.in);
        num2 = entrada2.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        Scanner entrada3 = new Scanner(System.in);
        num3 = entrada3.nextInt();

        if ((num1 > num2) & (num1 > num3)) {

            mayor = num1;

        }
        else if ((num2 > num1) & (num2 > num3)) {

            mayor = num2;

        }
        else if ((num3 > num1) & (num3 > num2)) {

            mayor = num3;

        }

        if (mayor != 0) {

            System.out.println("El valor mayor entre " + num1 + ", " + num2 + " y " + num3 + " es " + mayor);

        }
        else {

            System.out.println("Los tres numeros son iguales");

        }
    }
}
