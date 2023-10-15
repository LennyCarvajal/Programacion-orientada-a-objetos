package CarreraCiclistica;

public class Prueba {
    
    public static void main(String args[]) {
        
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);

        equipo1.AñadirCiclista(velocista1);
        equipo1.AñadirCiclista(escalador1);
        equipo1.AñadirCiclista(contrarrelojista1);

        velocista1.settiempo_acumulado(365);
        escalador1.settiempo_acumulado(385);
        contrarrelojista1.settiempo_acumulado(370);

        equipo1.calc_tiempo_total();
        equipo1.imprimir();
        equipo1.ListarEquipo();

    }

}
