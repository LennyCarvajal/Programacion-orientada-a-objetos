public class PruebaFiguras {
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);

        System.out.println("\nEl area del circulo es = " + figura1.calc_area());
        System.out.println("El perimetro del circulo es = " + figura1.calc_perimetro());

        System.out.println("\nEl area del rectangulo es = " + figura2.calc_area());
        System.out.println("El perimetro del rectangulo es = " + figura2.calc_perimetro());

        System.out.println("\nEl area del cuadrado es = " + figura3.calc_area());
        System.out.println("El perimetro del cuadrado es = " + figura3.calc_perimetro());

        System.out.println("\nEl area del triangulo es = " + figura4.calc_area());
        System.out.println("El perimetro del triangulo es = " + figura4.calc_perimetro());

        figura4.determinar_tipo_triangulo();
        }
    }