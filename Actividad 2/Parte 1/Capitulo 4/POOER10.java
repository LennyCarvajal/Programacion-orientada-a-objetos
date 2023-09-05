/* Ejercicio resuelto #10
 
Enunciado:
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.

 */

import java.util.Scanner;

public class POOER10 {
    public static void main(String[] args) {
    
        int estrato;
        String nombre, num_inscripcion;
        double patrimonio, valor_matricula;

        System.out.println("Ingrese el numero de inscripcion: ");
        Scanner entrada1 = new Scanner(System.in);
        num_inscripcion = entrada1.nextLine();


        System.out.println("Ingrese el nombre del estudiante: ");
        Scanner entrada2 = new Scanner(System.in);
        nombre = entrada2.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante: ");
        Scanner entrada3 = new Scanner(System.in);
        patrimonio = entrada3.nextDouble();

        System.out.println("Ingrese el estrato del estudiante: ");
        Scanner entrada4 = new Scanner(System.in);
        estrato = entrada4.nextInt();

        valor_matricula = 50_000;

        if ((patrimonio > 2_000_000) & (estrato > 3)) {

            valor_matricula += 0.03 * patrimonio;

        }

        System.out.println("El estudiante con numero de inscripcion " + num_inscripcion + " y nombre " + nombre + " debe pagar " + valor_matricula);

    }
}
