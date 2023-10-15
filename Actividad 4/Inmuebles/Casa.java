package Inmuebles;

public class Casa extends InmuebleVivienda {
    
    protected int num_pisos;

    public Casa(int id_inmobiliario, int area, String direccion, int num_baños, int num_habitaciones, int num_pisos) {
        super(id_inmobiliario, area, direccion, num_baños, num_habitaciones);
        this.num_pisos = num_pisos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + num_pisos);
    }

}
