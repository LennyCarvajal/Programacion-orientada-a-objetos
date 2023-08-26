// Ejercicio resuelto #12

/*
Enunciado:
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.
*/

import java.util.Scanner;

class POOER12 {
    public static void main(String[] args) {

        String NOM;
        int NHT;
        double VHN;

        System.out.println("Ingrese el nombre del trabajador: ");
        Scanner entrada = new Scanner(System.in);

        NOM = entrada.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas: ");
        Scanner entrada2 = new Scanner(System.in);

        NHT = entrada2.nextInt();

        System.out.println("Ingrese el valor de la hora de trabajo: ");
        Scanner entrada3 = new Scanner(System.in);

        VHN = entrada3.nextDouble();

        int HET = 0, HEE8 = 0;

        if (NHT > 40) {

            HET = NHT - 40;

            if (HET > 8) {

                HEE8 = HET - 8;

            }  

        }

        double Salario = 40 * VHN +  2 * (HET - HEE8) * VHN + 3 * HEE8 * VHN;

        System.out.println("El trabajador " + NOM + "devengo: $" + Salario);

    }
}
