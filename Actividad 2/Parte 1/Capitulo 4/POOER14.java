/* Ejercicio resuelto #14
  
Enunciado:
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.
  
 */

import java.util.Scanner;

public class POOER14 {
    public static void main(String[] args) {

        int VD1, VD2, VD3, TOTVEN;
        double SALAR, SALAR1, SALAR2, SALAR3, PORVEN;

        System.out.println("Ingrese el numero de ventas del primer departamento: ");
        Scanner entrada1 = new Scanner(System.in);

        VD1 = entrada1.nextInt();

        System.out.println("Ingrese el numero de ventas del segundo departamento: ");
        Scanner entrada2 = new Scanner(System.in);

        VD2 = entrada2.nextInt();

        System.out.println("Ingrese el numero de ventas del tercer departamento: ");
        Scanner entrada3 = new Scanner(System.in);

        VD3 = entrada3.nextInt();

        System.out.println("Ingrese el salario de los empleados: ");
        Scanner entrada4 = new Scanner(System.in);

        SALAR = entrada4.nextDouble();

        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;

        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR; 
        }

        else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR; 
        }

        else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        }

        else {
            SALAR3 = SALAR;
        }

        System.out.println("El salario de los empleados de primer departamento es: " + SALAR1);
        System.out.println("El salario de los empleados de segundo departamento es: " + SALAR2);
        System.out.println("El salario de los empleados de tercer departamento es: " + SALAR3);

    }
}
