/*  Ejercicio propuesto #21
  
Enunciado:
Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
semiperímetro y el área del triángulo.

*/

import java.util.Scanner;

public class POOEP21 {
    public static void main(String[] args) {

        double lado1, lado2, lado3, area, perimetro, semiperimetro;

        System.out.println("Ingrese el primer lado del triangulo: ");
        Scanner entrada1 = new Scanner(System.in);
        lado1 = entrada1.nextDouble();


        System.out.println("Ingrese el segundo lado del triangulo: ");
        Scanner entrada2 = new Scanner(System.in);
        lado2 = entrada2.nextDouble();


        System.out.println("Ingrese el tercer lado del triangulo: ");
        Scanner entrada3 = new Scanner(System.in);
        lado3 = entrada3.nextDouble();

        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println("El perimetro del triangulo es " + perimetro + " su semiperimetro es " + semiperimetro + " y su area es " + area);
    
    }
}
