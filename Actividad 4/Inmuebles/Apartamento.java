package Inmuebles;

public class Apartamento extends InmuebleVivienda{
    
    public Apartamento(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños) {
        super(id_inmobiliario, area, direccion, num_baños, num_habitaciones);
    }

    void imprimir() {
        super.imprimir();
    }

}
