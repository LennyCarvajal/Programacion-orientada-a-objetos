/* Ejercicio propuesto #19
 
Enunciado:
Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. 

 */

import java.util.Scanner;

public class POOEP19 {
    public static void main(String[] args) {

        double lado, perimetro, altura, area;

        System.out.println("Ingrese la longitud de un lado del triangulo equilatero: ");
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextDouble();

        perimetro = lado * 3;
        altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado/2, 2));
        area = (altura * lado) / 2;

        System.out.println("El perimetro del triangulo es " + perimetro + " su altura es " + altura + " y su area es " + area);


    }
}
