// Ejercicio propuesto #14

import java.util.Scanner;

public class POOEP14 {
    public static void main(String[] args) {

        double num, num_cuadrado, num_cubo;

        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);

        num = entrada.nextDouble();

        num_cuadrado = Math.pow(num, 2);
        num_cubo = Math.pow(num, 3);

        System.out.println("El cuadrado de " + num + " es " + num_cuadrado + " y su cubo es " + num_cubo);

    }
}
