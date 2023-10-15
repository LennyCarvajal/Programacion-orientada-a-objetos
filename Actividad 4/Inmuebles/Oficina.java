package Inmuebles;

public class Oficina extends Local {

    protected static double valor_area = 3_500_000;
    protected boolean gobierno;

    public Oficina(int id_inmobiliario, int area, String direccion, tipo tipo_local, boolean gobierno) {
        super(id_inmobiliario, area, direccion, tipo_local);
        this.gobierno = gobierno;
    }
    
    void imprimir() {
        
    }

}
