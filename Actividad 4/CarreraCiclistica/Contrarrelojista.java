package CarreraCiclistica;

public class Contrarrelojista extends Ciclista {
    
    private double velocidad_maxima;

    public Contrarrelojista(int identificador, String nombre, double velocidad_maxima) {
        super(identificador, nombre);
        this.velocidad_maxima = velocidad_maxima;
    }

    protected double getvelocidad_maxima() {
        return velocidad_maxima;
    }

    protected void setvelocidad_maxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    protected void imprimir() {
        super.imprimir(); 
        System.out.println("Velocidad maxima = " + velocidad_maxima);
    }

    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }


}
