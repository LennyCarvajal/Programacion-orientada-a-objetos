// Ejercicio resuelto #5

class POOER5 {
    public static void main(String[] args) {
        
        double suma, x, y;

        suma = 0;
        x = 20;
        y = 40;

        suma += x;
        x += Math.pow(y, 2);
        
        suma += x/y;

        System.out.println("El valor de la suma es: " + suma);

        }
}