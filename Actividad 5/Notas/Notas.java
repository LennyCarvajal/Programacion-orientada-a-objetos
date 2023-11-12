package Notas; 

public class Notas {
    double[] lista_notas;

    public Notas() {
        lista_notas = new double[5];
    }

    double calc_promedio() {
        double suma = 0;

        for (int i = 0; i < lista_notas.length; i++) {
            suma += lista_notas[i];
        }

        return (suma / lista_notas.length);
    }

    double calc_desviacion() {
        double prom = calc_promedio();
        double suma = 0;

        for (int i = 0; i < lista_notas.length; i++) {
            suma += Math.pow(lista_notas[i] - prom, 2);
        }

        return (suma / lista_notas.length);
    }

    double calc_menor() {
        double menor = lista_notas[0];

        for (int i = 0; i < lista_notas.length; i++) {

            if (lista_notas[i] < menor) {
                menor = lista_notas[i];
            }

        }

        return menor;
    }

    double calc_mayor() {
        double mayor = lista_notas[0];

        for (int i = 0; i < lista_notas.length; i++) {

            if (lista_notas[i] > mayor) {
                mayor = lista_notas[i];
            }

        }

        return mayor;
    }
}