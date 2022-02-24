import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Pedro", Atleta.Genero.Masculino, LocalDate.of(1980, 5, 12));
        Atleta atleta2 = new Atleta("Juan", Atleta.Genero.Masculino, LocalDate.of(1992, 6, 24));
        Atleta atleta3 = new Atleta("Maria", Atleta.Genero.Femenino, LocalDate.of(1997, 2, 17));
        Atleta atleta4 = new Atleta("Paula", Atleta.Genero.Femenino, LocalDate.of(1997, 5, 15));

        atleta1.debutar(LocalDate.of(2000, 7, 23));
        atleta3.debutar(LocalDate.of(2010, 3, 25));
        atleta4.debutar(LocalDate.of(2010, 3, 27));
        atleta1.retirar(LocalDate.of(2015, 7, 23));

        Prueba natacion = new Prueba("Natacion");

        Campeonato campeonatoNatacion = new Campeonato(natacion);
        Marca marca = new Marca(natacion, atleta3, 5);
        Marca marca2 = new Marca(natacion, atleta4, 5);

        if(campeonatoNatacion.marcaRealizada(marca))
            System.out.println("Se ha podido añadir la marca");
        else System.out.println("No se ah podido añadir la marca");

        if (campeonatoNatacion.inscribeAtleta(atleta1))
            System.out.println("Se ha podido inscribir el atleta");
        else System.out.println("No se ha podido inscribir el atleta");

        if(campeonatoNatacion.finalizar())
            System.out.println("Se ha finalizado el campeonato");
        else System.out.println("No se ha podido finalizar el campeonato");

        if(campeonatoNatacion.iniciar())
            System.out.println("Se ha iniciado el campeonato");
        else System.out.println("No se ha podido iniciar el campeonato");


        if(campeonatoNatacion.iniciar())
            System.out.println("Se ha iniciado el campeonato");
        else System.out.println("No se ha podido iniciar el campeonato");


        if (campeonatoNatacion.inscribeAtleta(atleta1))
            System.out.println("Se ha podido inscribir el atleta");
        else System.out.println("No se ha podido inscribir el atleta");

        if (campeonatoNatacion.inscribeAtleta(atleta2))
            System.out.println("Se ha podido inscribir el atleta");
        else System.out.println("No se ha podido inscribir el atleta");

        if (campeonatoNatacion.inscribeAtleta(atleta3))
            System.out.println("Se ha podido inscribir el atleta");
        else System.out.println("No se ha podido inscribir el atleta");

        if(campeonatoNatacion.marcaRealizada(marca))
            System.out.println("Se ah podido añadir la marca");
        else System.out.println("No se ah podido añadir la marca");

        if(campeonatoNatacion.marcaRealizada(marca2))
            System.out.println("Se ah podido añadir la marca");
        else System.out.println("No se ah podido añadir la marca");

        if(campeonatoNatacion.finalizar())
            System.out.println("Se ha finalizado el campeonato");
        else System.out.println("No se ha podido finalizar el campeonato");

        System.out.println("La mejor marca es " + campeonatoNatacion.mejorMarca().getResultado());


    }
}
