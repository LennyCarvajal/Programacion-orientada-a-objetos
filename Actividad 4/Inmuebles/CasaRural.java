package Inmuebles;

public class CasaRural extends Casa {
    
    protected static double valor_area = 1_500_000;
    protected double dist_cabecera;
    protected double altitud;

    public CasaRural(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños, int num_pisos, double dist_cabrera, double altitud) {
        super(id_inmobiliario, area, direccion, num_baños, num_habitaciones, num_pisos);
        this.dist_cabecera = dist_cabrera;
        this.altitud = altitud;
    }

    void imprimir() {
        super.imprimir(); 
        System.out.println("Distancia la cabecera municipal = " +
        dist_cabecera + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }
        
}
