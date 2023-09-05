public class Circulo {
    double radio;

    Circulo(double radio){
        this.radio = radio;
    }

    double calc_area() {
        return Math.PI * Math.pow(radio, 2);
    }

    double calc_perimetro() {
        return 2 * Math.PI * radio;
    }
}

