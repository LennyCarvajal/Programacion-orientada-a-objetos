/* Ejercicio propuesto #23
 
Enunciado:
Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación

 */

import java.util.Scanner;

public class POOEP23 {
    public static void main(String[] args) {

        double a, b, c, x1, x2;

        System.out.println("Ingrese el coeficiente a: ");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();

        System.out.println("Ingrese el coeficiente b: ");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();

        System.out.println("Ingrese el coeficiente c: ");
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextDouble();

        x1 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
        x2 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;

        System.out.println("Las raices de " + a + "x^2 + " + b + "x + " + c + " = 0 son x1 = " + x1 + " y x2 = " + x2);

    }     
}
