package TallerEvaluacionJava;

// Ejercicio 18 Video Juego

import java.util.List;

public class Videojuego implements Entregable {

    private String titulo;
    private Integer horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Actividad016Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregar() {
        entregado = true;
        return entregado;
    }

    @Override
    public boolean devolver() {
        entregado = false;
        return entregado;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return entregado;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Object a) {

        int comparar = ((Integer) this.horasEstimadas).compareTo(((Videojuego) a).getHorasEstimadas());
        return comparar;


    }
}
