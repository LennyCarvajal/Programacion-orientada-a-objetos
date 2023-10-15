import java.util.*;

public class pruebacuenta {
    public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    System.out.println("Cuenta de ahorros");
    System.out.println("Ingrese saldo inicial = $");
    float saldoInicialAhorros = input.nextFloat();

    System.out.print("Ingrese tasa de interés = ");
    float tasa_ahorros = input.nextFloat();
    CuentaAhorros cuenta1 = new

    CuentaAhorros(saldoInicialAhorros, tasa_ahorros);

    System.out.print("Ingresar cantidad a consignar: $");
    float cantidadDepositar = input.nextFloat();
    cuenta1.consignar(cantidadDepositar);

    System.out.print("Ingresar cantidad a retirar: $");
    float cantidadRetirar = input.nextFloat();

    cuenta1.retirar(cantidadRetirar);
    cuenta1.extracto_mensual();
    cuenta1.imprimir();
    }
}