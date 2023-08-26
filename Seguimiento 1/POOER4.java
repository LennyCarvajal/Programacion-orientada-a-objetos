// Ejercicio resuelto #4

/*
Enunciado:
A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
*/

import java.util.Scanner;
class POOER4 {
    public static void main(String[] args) {
        
        int Juan_edad;
        
        System.out.println("Ingrese la edad de Juan: ");
        Scanner entrada = new Scanner(System.in);
        Juan_edad = entrada.nextInt();
        
        
        int Alberto_edad = 2 * (Juan_edad/3);
        int Ana_edad = 4 * (Juan_edad/3);
        int Mama_edad = Juan_edad + Ana_edad + Alberto_edad;
        
        System.out.println("La edad de Juan es: " + Juan_edad);
        System.out.println("La edad de Alberto es: " + Alberto_edad);
        System.out.println("La edad de Ana es: " + Ana_edad);
        System.out.println("La edad de la mama es: " + Mama_edad);
        }
}
