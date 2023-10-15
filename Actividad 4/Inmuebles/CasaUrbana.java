package Inmuebles;

public class CasaUrbana extends Casa {
    
    public CasaUrbana(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños, int num_pisos) {
        super(id_inmobiliario, area, direccion, num_baños, num_habitaciones, num_pisos);
    }

    void imprimir() {
        super.imprimir();
    }

}
