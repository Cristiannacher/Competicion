import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Campeonato {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Prueba prueba;
    private List<Atleta> atletas = new LinkedList<>();
    private List<Marca> marcas = new LinkedList<>();

    public Campeonato(Prueba prueba) {
        this.prueba = prueba;
    }

    public boolean inscribeAtleta(Atleta atleta) {
        boolean inscrito = true;
        if (atleta.estaActivo(fechaInicio)) {
            if(atletas.contains(atleta))
                    inscrito = false;
            else atletas.add(atleta);
            } else inscrito = false;
        return inscrito;
    }

    public boolean marcaRealizada(Marca marca) {
        boolean marcado = true;
        if (fechaInicio != null && prueba == marca.getPrueba()) {
            if (atletas.contains(marca.getDeportista())) {
                marcas.add(marca);
            } else marcado = false;
        } else marcado = false;
        return marcado;
    }

    public boolean iniciar() {
        boolean iniciado = true;
        if (fechaInicio == null && fechaFin == null)
            fechaInicio = LocalDate.now();
        else iniciado = false;
        return iniciado;
    }

    public boolean finalizar() {
        boolean finalizado = true;
        if (fechaInicio != null && fechaFin == null)
            fechaFin = LocalDate.now();
        else finalizado = false;
        return finalizado;
    }

    public Marca mejorMarca(){
        Marca merjorResultado = marcas.get(1);
        for(Marca marca : marcas){
            if(marca.getResultado()< merjorResultado.getResultado())
                merjorResultado = marca;
        }
        return merjorResultado;
    }
}
