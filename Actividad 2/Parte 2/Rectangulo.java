public class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calc_area() {
        return base * altura;
    }

    double calc_perimetro() {
        return 2 * (base + altura);
    }
    
}