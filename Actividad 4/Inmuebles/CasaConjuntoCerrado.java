package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    
    protected static double valor_area = 2_500_000;
    protected double valor_admin;
    protected boolean piscina;
    protected boolean campos_deportivos;

    public CasaConjuntoCerrado(int id_inmobiliario, int area, String direccion, int num_habitaciones, int num_baños, int num_pisos, int valor_admin, boolean piscina, boolean campos_deportivos) {
        super(id_inmobiliario, area, direccion, num_habitaciones, num_baños, num_pisos);
        this.valor_admin = valor_admin;
        this.piscina = piscina;
        this.campos_deportivos = campos_deportivos;        
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion = " + valor_admin);
        System.out.println("Tiene piscina? " + piscina);
        System.out.println("Tiene campos deportivos?" + campos_deportivos);
        System.out.println();
    }

}
