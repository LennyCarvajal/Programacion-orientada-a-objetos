package CarreraCiclistica;

import java.util.*;

public class Equipo {

    private String nombre;
    private static double tiempo_total;
    private String pais;
    Vector lista_ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        tiempo_total = 0;
        lista_ciclistas = new Vector();
    }   
    
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpais() {
        return pais;
    }

    private void setpais(String pais) {
        this.pais = pais;
    }

    void AñadirCiclista(Ciclista ciclista) {
        lista_ciclistas.add(ciclista);
    }

    void ListarEquipo() {
        for (int i = 0; i < lista_ciclistas.size(); i++) {

            Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
            System.out.println(c.getnombre());

        }
    }

    void BuscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombre_ciclista = sc.next();

        for (int i = 0; i < lista_ciclistas.size(); i++) {

            Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
            if (c.getnombre().equals(nombre_ciclista)) {
                System.out.println(c.getnombre());

            }
        }
    }

    void calc_tiempo_total() {  
        for (int i = 0; i < lista_ciclistas.size(); i++) { 

            Ciclista c = (Ciclista) lista_ciclistas.elementAt(i); 
            tiempo_total += c.gettiempo_acumulado();

        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais = " + pais);
        System.out.println("Tiempo total del equipo = " + tiempo_total);
    }

}
