public class Cuadrado {
    double lado; 

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    double calc_area() {
        return lado*lado;
    }

    double calc_perimetro() {
        return 4*lado;
    }
}