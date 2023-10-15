public class CuentaAhorros extends Cuenta {

    private boolean activa;
    
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo > 10_000) {
            activa = true;
        }
        else {
            activa = false;
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void extracto_mensual() {
        if (num_retiros > 4) {
            comision_mensual += (num_retiros - 4) / 1_000;
        }

        super.extracto_mensual();

        if (saldo < 10_000) {
            activa = false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comision mensual = $ " + comision_mensual);
        System.out.println("Numero de transacciones = " + (num_consignaciones + num_retiros));
        System.out.println();
    }

}
