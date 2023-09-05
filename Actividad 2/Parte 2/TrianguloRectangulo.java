public class TrianguloRectangulo {
    double base; 
    double altura; 

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calc_area() {
        return base * altura / 2;
    }

    double calc_hipotenusa() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
    }

    double calc_perimetro() {
        return (base + altura + calc_hipotenusa()); 
    }

    void determinar_tipo_triangulo() {
        if ((base == altura) && (base == calc_hipotenusa()) && (altura == calc_hipotenusa())) {
            System.out.println("Es un triangulo equilatero"); 
        }

        else if ((base != altura) && (base != calc_hipotenusa()) && (altura != calc_hipotenusa())) {
            System.out.println("Es un triangulo escaleno"); 
        }

        else {
            System.out.println("Es un triangulo isosceles"); 
        }
    }

}