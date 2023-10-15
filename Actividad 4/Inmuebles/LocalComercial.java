package Inmuebles;

public class LocalComercial extends Local {

    protected static double valor_area = 3_000_000;
    protected String centro_comercial;

    public LocalComercial(int id_inmobiliario, int area, String direccion, tipo tipo_local, String centro_comercial) {
        super(id_inmobiliario, area, direccion, tipo_local);
        this.centro_comercial = centro_comercial;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centro_comercial);
        System.out.println();
    }

}
