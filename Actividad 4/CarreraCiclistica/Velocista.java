package CarreraCiclistica;

public class Velocista extends Ciclista {

    private double potencia_promedio;
    private double velocidad_promedio;

    public Velocista(int identificador, String nombre, double potencia_promedio, double velocidad_promedio) {
        super(identificador, nombre);
        this.potencia_promedio = potencia_promedio;
        this.velocidad_promedio = velocidad_promedio;
    }

    protected double getpotencia_promedio() {
        return potencia_promedio;
    }

    protected void setpotencia_promedio(double potencia_promedio) {
        this.potencia_promedio = potencia_promedio;
    }

    protected double getvelocidad_promedio() {
        return velocidad_promedio;
    }
   
    protected void setvelocidad_promedio(double velocidad_promedio) {
        this.velocidad_promedio = velocidad_promedio;
    }

    protected void imprimir() {
        super.imprimir(); 
        System.out.println("Potencia promedio = " + potencia_promedio);
        System.out.println("Velocidad promedio = " + velocidad_promedio);
    }

    protected String imprimirTipo() {
        return "Es un velocista";
    }
        
    
}
