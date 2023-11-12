package Figuras;

public class Cilindro extends FiguraGeometrica {
    
    private double radio;
    private double altura;
    

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calc_volumen());
        this.setSuperficie(calc_superficie());
    }

    public double calc_volumen() {
        double volumen = altura * (Math.PI * Math.pow(radio, 2));
        return volumen;
    }

    public double calc_superficie() {
        double superficie = altura * (2 * Math.PI * radio) + 2 * Math.PI * Math.pow(radio, 2);
        return superficie;
    }

}
