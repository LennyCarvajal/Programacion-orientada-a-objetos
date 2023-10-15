package CarreraCiclistica;

public class Escalador extends Ciclista {

    private double aceleracion_promedio;
    private double grado_rampa;

    public Escalador(int identificador, String nombre, double aceleracion_promedio, double grado_rampa) {
        super(identificador, nombre);
        this.aceleracion_promedio = aceleracion_promedio;
        this.grado_rampa = grado_rampa;
    }

    protected double getaceleracion_promedio() {
        return aceleracion_promedio;
    }

    protected void setaceleracion_promedio(double aceleracion_promedio) {
        this.aceleracion_promedio = aceleracion_promedio;
    }

    protected double getgrado_rampa() {
        return grado_rampa;
    }

    protected void setgrado_rampa(double grado_rampa) {
        this.grado_rampa = grado_rampa;
    }
    
    protected void imprimir() {
        super.imprimir(); 
        System.out.println("Aceleración promedio = " + aceleracion_promedio);
        System.out.println("Grado de rampa = " + grado_rampa);
        }

    protected String imprimirTipo() {
        return "Es un escalador";
    }
        

}
