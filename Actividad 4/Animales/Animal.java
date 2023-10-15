package Animales;

public abstract class Animal {
    
    protected String sonido;
    protected String alimentacion;
    protected String habitat;
    protected String nombre_cientifico;

    public abstract String getnombre_cientifico();
    public abstract String getsonido();
    public abstract String getalimentacion();
    public abstract String gethabitat();

}
