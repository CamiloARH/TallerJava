package TallerEvaluacionJava;

// Ejercicio 18 Serie

public class Serie implements Entregable {

    private String titulo;
    private Integer numeroTemporada = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporada = numeroTemporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(Integer numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Actividad016Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        int comparar = ((Integer) this.numeroTemporada).compareTo(((Serie) a).getNumeroTemporada());
        return comparar;

    }
}
