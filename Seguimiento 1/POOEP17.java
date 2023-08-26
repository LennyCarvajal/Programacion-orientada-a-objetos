// Ejercicio propuesto #17

import java.util.Scanner;

public class POOEP17 {
    public static void main(String[] args) {

        double radio, circunferencia, area;

        System.out.println("Ingrese el radio del circulo: ");
        Scanner entrada = new Scanner(System.in);

        radio = entrada.nextDouble();

        circunferencia = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La circunferencia del circulo es: " + circunferencia);

    }
}
