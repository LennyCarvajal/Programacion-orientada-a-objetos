package CarreraCiclistica;

public abstract class Ciclista {

    private int identificador;
    private String nombre; 
    private int tiempo_acumulado = 0; 
    
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    protected String getnombre() {
        return nombre;
    }

    protected void setnombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getposicion_general(int posicion_general) {
        return posicion_general;
    }
      

    protected void setposicion_general(int posicion_general) {
        posicion_general = posicion_general;
    }
 
    protected int gettiempo_acumulado() {
        return tiempo_acumulado;
    }
    
    protected void settiempo_acumulado(int tiempo_acumulado) {
        this.tiempo_acumulado = tiempo_acumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempo_acumulado);
    }
        

}
