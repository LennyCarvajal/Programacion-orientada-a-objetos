package Inmuebles;

public class Apartaestudio extends Apartamento {
    
    protected static double valor_area = 1_500_000;

    public Apartaestudio(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños) {
        super(id_inmobiliario, area, direccion, num_habitaciones, num_baños);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }

}
