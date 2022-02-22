public class Prueba {

    private String nombre;

    public Prueba (String nombre){
        this.nombre = nombre;
    }

    public boolean es (Prueba prueba){
        return (nombre.equals(prueba.nombre));
    }


}
