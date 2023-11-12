package Figuras;

public class Esfera extends FiguraGeometrica  {
    
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calc_volumen());
        this.setSuperficie(calc_superficie());
    }

    public double calc_volumen() {
        double volumen = 4*(Math.PI * Math.pow(radio, 3)) / 3;
        return volumen;
    }

    public double calc_superficie() {
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        return superficie;
    }

}
