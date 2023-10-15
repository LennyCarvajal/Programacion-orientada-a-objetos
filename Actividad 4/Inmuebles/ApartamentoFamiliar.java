package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valor_area = 2_000_000;
    protected double valor_admin;

    public ApartamentoFamiliar(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños, double valor_admin) {
        super(id_inmobiliario, area, direccion, num_habitaciones, num_baños);
        this.valor_admin = valor_admin;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" + valor_admin);
        System.out.println();
    }
        
}
