import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Campeonato {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Prueba prueba;
    private List<Atleta> atletas = new LinkedList<>();
    private List<Marca> marcas = new LinkedList<>();

    // he creado estas dos variables para los metodos iniciar y finalizar porque si no, no les
    // encuentro mucho sentido, quiero decir si no las creo el meto me devuelve un boolean pero luego
    // para que me sirve?? tendria que estar ejecutando el metodo dentro de cada metodo para comprobar
    // que el campeonato esta iniciado ya que esa informacion no estaba en ningun sitio
    // no se si entiendes lo que quiero decir.
    // vasicamente con las variables queda marcado cuando esta iniciado y finalizado el campeonato.

    //por esto mismo fechainicio y fechafin no me sirve de mucho, ademas para hacer los metodo de inicio
    // y fin de forma correcta solo me tendria que dejar iniciar ho finalizar en sus respectivas fechas
    // pero claro entonces le tendria que pasar las fechas al metodo pero seria muy artificial.

    // bueno el caso es que como sobreentiendo que es un ejercicio para practicar lo he heco de la forma
    // que me parecia mas correcta/simple para que todo tuviera "sentido" (porque quando pongo la palabra todo se pone en verde?)
    private boolean iniciado;
    private boolean finalizado ;

    public Campeonato(Prueba prueba, LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prueba = prueba;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public boolean inscribeAtleta(Atleta atleta) {
        if (atleta.estaActivo(fechaInicio) && !atletas.contains(atleta)) {
            atletas.add(atleta);
            return  true;
        } else return  false;
    }

    public boolean marcaRealizada(Marca marca) {
        if (iniciado && prueba.equals(marca.getPrueba())) {
            if (atletas.contains(marca.getDeportista())) {
                marcas.add(marca);
                return true;
            } else return false;
        } else return false;
    }

    public boolean iniciar() {
        if (finalizado || iniciado ) {
            return false;
        } else {
            iniciado = true;
            return true;
        }
    }

    public boolean finalizar() {
        if (iniciado) {
            finalizado = true;
            iniciado = false;
            return true;
        } else return false;
    }

    public Marca mejorMarca() {
        Marca merjorResultado;
        if(marcas != null) {
            merjorResultado = marcas.get(1);
            for (Marca marca : marcas) {
                if (marca.getResultado() < merjorResultado.getResultado())
                    merjorResultado = marca;
            }
        } else return null;
        return merjorResultado;
    }


}
