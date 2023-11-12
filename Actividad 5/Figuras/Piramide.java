package Figuras;

public class Piramide extends FiguraGeometrica {

    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calc_volumen()); 
        this.setSuperficie(calc_superficie());
    }

    public double calc_volumen() {
        double volumen = (Math.pow(base, 2) * altura) / 3;
        return volumen;
    }

    public double calc_superficie() {
        double superficie = Math.pow(base, 2) + 2 * base * apotema;
        return superficie;
    }
    
}
