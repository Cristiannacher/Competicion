import java.time.LocalDate;
import java.time.Period;

public class Atleta {
    private String nombre;

    public enum Genero {Masculino, Femenino;}

    private Genero genero;
    private LocalDate nacimiento;
    private LocalDate inicioCarrera;
    private LocalDate finCarrera;

    public Atleta(String nombrea, Genero genero, LocalDate nacimiento) {
        this.nombre = nombrea;
        this.genero = genero;
        this.nacimiento = nacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public int edad() {
        Period vida = Period.between(nacimiento, LocalDate.now());
        return vida.getYears();
    }

    public boolean debutar(LocalDate fecha) {
        boolean puededebutar = true;
        if (finCarrera == null && inicioCarrera == null && fecha.isAfter(nacimiento))
            this.inicioCarrera = fecha;
        else puededebutar = false;

        return puededebutar;
    }

    public boolean retirar(LocalDate fecha) {
        boolean retirado = true;
        if (finCarrera == null && inicioCarrera != null && fecha.isAfter(inicioCarrera))
            finCarrera = fecha;
        else retirado = false;

        return retirado;
    }

    public boolean estaActivo(LocalDate fecha) {
        if(inicioCarrera == null)
            return false;
        LocalDate fechaFin = finCarrera == null ? LocalDate.now() : finCarrera;
        return (fecha.isAfter(inicioCarrera) && fecha.isBefore(fechaFin));
    }

    public int diasActivo() {
        int dias = 0;
        if (finCarrera != null && inicioCarrera != null) {
            dias = inicioCarrera.until(finCarrera).getDays();
            if (finCarrera == null)
                dias = inicioCarrera.until(LocalDate.now()).getDays();
        }
        return dias;
    }
}
