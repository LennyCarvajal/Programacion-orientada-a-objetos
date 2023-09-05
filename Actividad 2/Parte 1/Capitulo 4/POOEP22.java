/* Ejercicio propuesto #22
 
Enunciado:
Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.

 */

import java.util.Scanner;

public class POOEP22 {
    public static void main(String[] args) {

        double valor_hora, numero_horas, salario;

        System.out.println("Ingrese el nombre del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        String nombre = entrada1.nextLine();

        System.out.println("Ingrese el salario basico por hora: ");
        Scanner entrada2 = new Scanner(System.in);
        valor_hora = entrada2.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        Scanner entrada3 = new Scanner(System.in);
        numero_horas = entrada3.nextDouble();

        salario = numero_horas * valor_hora;

        if (salario > 450_000) {
            System.out.println("El salario de " + nombre + " es de: $" + salario);
        }
        else {
            System.out.println("El salario de " + nombre + " es menor a $450000");
        }

    }    
}
