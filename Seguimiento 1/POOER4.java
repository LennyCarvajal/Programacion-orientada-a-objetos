// Ejercicio resuelto #4

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