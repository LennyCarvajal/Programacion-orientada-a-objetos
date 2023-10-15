package Inmuebles;

public class InmuebleVivienda extends Inmueble {

    protected int num_habitaciones;
    protected int num_baños;

    public InmuebleVivienda(int id_inmobiliario, int area, String direccion, int num_baños, int num_habitaciones) {
        super(id_inmobiliario, area, direccion);
        this.num_baños = num_baños;
        this.num_habitaciones = num_habitaciones;
    }

    void imprimir() {
        super.imprimir(); 
        System.out.println("Número de habitaciones = " + num_habitaciones);
        System.out.println("Número de baños = " + num_baños);
    }
}
