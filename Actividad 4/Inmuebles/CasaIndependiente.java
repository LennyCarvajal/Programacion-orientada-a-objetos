package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    
    protected static double valor_area = 3_000_000;

    public CasaIndependiente(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños, int num_pisos) {
        super(id_inmobiliario, area, direccion, num_baños, num_habitaciones, num_pisos);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }

}
