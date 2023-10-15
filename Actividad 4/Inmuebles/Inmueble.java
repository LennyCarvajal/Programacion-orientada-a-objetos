package Inmuebles;

public class Inmueble {
    
    protected int id_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio_venta;

    Inmueble(int id_inmobiliario, int area, String direccion) {
        this.id_inmobiliario = id_inmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    double calc_precio_venta(double valor_area) {
        precio_venta = area * valor_area;
        return precio_venta;
    }

    void imprimir() {
        System.out.println("Identificador inmobiliario = " + id_inmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio de venta = $" + precio_venta);
    }

}