/* Ejercicio resuelto #13
 
Enunciado: 
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. 
Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados.

 */

import java.util.Scanner;

public class POOER13 {
    public static void main(String[] args) {

        String color;
        double valor_compra, pago, descuento = 0;

        System.out.println("Ingrese el valor de la compra: ");
        Scanner entrada1 = new Scanner(System.in);
        valor_compra = entrada1.nextDouble();

        System.out.println("Ingrese el color de la bolita: ");
        Scanner entrada2 = new Scanner(System.in);
        color = entrada2.nextLine();

        switch(color) {
            case "BLANCA": 

                descuento = 0;
                break;
            
            case "VERDE": 

                descuento = 0.1;
                break;
            
            case "AMARILLA":

                descuento = 0.25;
                break;
            
            case "AZUL": 

                descuento = 0.5;
                break;
            
            case "ROJA": 

                descuento = 1;
                break;

        }

    pago = valor_compra - valor_compra * descuento;

    System.out.println("El cliente debe pagar: " + pago);

    }
}