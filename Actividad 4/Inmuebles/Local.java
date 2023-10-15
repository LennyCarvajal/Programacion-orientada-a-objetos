package Inmuebles;

public class Local extends Inmueble {
    
    enum tipo {INTERNO, CALLE};
    protected tipo tipo_local;

    public Local(int id_inmobiliario, int area, String direccion, tipo tipo_local) {
        super(area, area, direccion);
        this.tipo_local = tipo_local;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipo_local);
    }

}
