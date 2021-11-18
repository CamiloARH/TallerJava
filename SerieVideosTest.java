package TallerEvaluacionJava;

import java.util.ArrayList;

public class SerieVideosTest {
    public static void main(String[] args) {

        int serieEntregada = 0;
        int juegoEntregada = 0;
        ArrayList<Serie> listaSeries = new ArrayList<>();
        Serie serie1 = new Serie("Stranger Things",3,"Ciencia Ficción","Hermanos Duffer");
        Serie serie2 = new Serie("Monk",8,"Humor","Andy Breckman");
        Serie serie3 = new Serie("Friends",9,"Humor","David Crane");
        Serie serie4 = new Serie("How i met your mother",3,"Humor","Bays & Thomas");
        Serie serie5 = new Serie("Shaman King",2,"Ciencia Ficción","Hiroyuki Takei");
        listaSeries.add(serie1);
        listaSeries.add(serie2);
        listaSeries.add(serie3);
        listaSeries.add(serie4);
        listaSeries.add(serie5);

        ArrayList<Videojuego> listaVideoJuegos = new ArrayList<>();
        Videojuego juego1 = new Videojuego("Pokemon",10,"RPG","Nintendo");
        Videojuego juego2 = new Videojuego("Final Fantasy",25,"RPG","Square Enix");
        Videojuego juego3 = new Videojuego("Mario Bross",5,"Aventura","Nintendo");
        Videojuego juego4 = new Videojuego("Zelda",40,"RPG","Nintendo");
        Videojuego juego5 = new Videojuego("Octopath Traveler",80,"RPG","Square Enix");
        listaVideoJuegos.add(juego1);
        listaVideoJuegos.add(juego2);
        listaVideoJuegos.add(juego3);
        listaVideoJuegos.add(juego4);
        listaVideoJuegos.add(juego5);

        listaSeries.get(0).entregar();
        listaSeries.get(2).entregar();
        listaSeries.get(4).entregar();

        listaVideoJuegos.get(0).entregar();
        listaVideoJuegos.get(2).entregar();
        listaVideoJuegos.get(4).entregar();



        for (int i = 0; i < listaSeries.size(); i++) {
            if(listaSeries.get(i).isEntregado()){
                serieEntregada+=1;
                listaSeries.get(i).devolver();
            }

        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("la lista de series entregadas son: "+ serieEntregada);
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < listaVideoJuegos.size(); i++) {
            if(listaVideoJuegos.get(i).isEntregado()){
                juegoEntregada+=1;
                listaVideoJuegos.get(i).devolver();
            }
        }
        System.out.println("la lista de juegos entregadas son: "+ juegoEntregada);
        juego1.compareTo(juego2);

        listaSeries.stream().sorted((x,y)-> y.getNumeroTemporada().compareTo(x.getNumeroTemporada())).forEach(listaSeries::add);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("La serie con mas temporadas es: " + listaSeries.get(5).getTitulo());
        System.out.println("-------------------------------------------------------------------------------");

        listaVideoJuegos.stream().sorted((x,y)-> y.getHorasEstimadas().compareTo(x.getHorasEstimadas())).forEach(listaVideoJuegos::add);

        System.out.println("El video juego con mas horas es: "+listaVideoJuegos.get(5).getTitulo());
        System.out.println("-------------------------------------------------------------------------------");

    }
}
