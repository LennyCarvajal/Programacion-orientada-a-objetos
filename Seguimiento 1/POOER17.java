// Ejercicio resuelto #17

import java.util.Scanner;

public class POOER17 {
    public static void main(String[] args) {

        int N, NUM = 1, SUMA = 0;

        System.out.println("Ingrese un numero entero: ");
        Scanner entrada = new Scanner(System.in);

        N = entrada.nextInt();


        while (NUM <= N) {

            SUMA += NUM;
            NUM += 1;

        }

        System.out.println("La suma es: " + SUMA);
        
    }
}
