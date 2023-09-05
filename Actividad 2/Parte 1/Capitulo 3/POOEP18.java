/*  Ejercicio propuesto #18

Enunciado: 
Se tiene la siguiente información de un empleado:
· código del empleado,
· nombres,
· número de horas trabajadas al mes,
· valor hora trabajada,
· porcentaje de retención en la fuente.
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

*/

import java.util.Scanner;

public class POOEP18 {
    public static void main(String[] args) {

        String nombre;
        int codigo_empleado;
        double valor_hora, retencion, salario_bruto, salario_neto, retencion_total, numero_horas;

        System.out.println("Ingrese el codigo del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        codigo_empleado = entrada1.nextInt();


        System.out.println("Ingrese el nombre del empleado: ");
        Scanner entrada2 = new Scanner(System.in);
        nombre = entrada2.nextLine();


        System.out.println("Ingrese el numero de horas trabajadas por el empleado en el mes: ");
        Scanner entrada3 = new Scanner(System.in);
        numero_horas = entrada3.nextDouble();

        System.out.println("Ingrese el valor de la hora trabajada: ");
        Scanner entrada4 = new Scanner(System.in);
        valor_hora = entrada4.nextDouble();

        System.out.println("Ingrese el porcentaje de la retencion ");
        Scanner entrada5 = new Scanner(System.in);
        retencion = (entrada5.nextDouble()) / 100;
            
        salario_bruto = numero_horas * valor_hora;
        retencion_total = salario_bruto * retencion;
        salario_neto = salario_bruto - retencion_total;

        System.out.println("El empleado " + nombre + " con codigo " + codigo_empleado + " tiene un salario bruto de " + salario_bruto + " y un salario neto de " + salario_neto);

    }

}