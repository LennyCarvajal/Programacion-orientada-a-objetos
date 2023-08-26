// Ejercicio propuesto #12

public class POOEP12 {
    public static void main(String[] args) {

        int numero_horas = 48;
        double valor_hora = 5000, retencion = 0.125, salario_bruto, salario_neto, retencion_total;
        
        salario_bruto = numero_horas * valor_hora;
        retencion_total = salario_bruto * retencion;
        salario_neto = salario_bruto - retencion_total;

        System.out.println("El salario bruto del trabajador es: " + salario_bruto);
        System.out.println("La retencion en la fuente es: " + retencion_total);
        System.out.println("El salario neto del trabajador es: " + salario_neto);

    }
}
