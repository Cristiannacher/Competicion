public class Marca {
    private Prueba prueba;
    private Atleta deportista;
    private int resultado;

    public Marca (Prueba prueba, Atleta deportista, int resultado ){
        this.prueba = prueba;
        this.deportista =  deportista;
        this.resultado = resultado;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public Atleta getDeportista() {
        return deportista;
    }

    public int getResultado() {
        return resultado;
    }
}

