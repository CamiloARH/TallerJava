package TallerEvaluacionJava;

// Ejercicio 17 Television

public class Television extends Electrodomesticos {

    private Integer resolucion= 20;
    private boolean sintonizadorTDT = false;

    public Television() {

    }

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(Integer precioBase, String color, char consumoEnergetico, Integer peso, Integer resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        double aunmentoPrecio=0;
        if (sintonizadorTDT==true && resolucion>=40){
            aunmentoPrecio = getPrecioBase()*0.3+getPrecioBase();
            setPrecioBase(50+aunmentoPrecio);
        }else if(sintonizadorTDT==true){
            setPrecioBase(50+aunmentoPrecio);
        }else if (sintonizadorTDT==false && resolucion>=40){
            aunmentoPrecio = getPrecioBase()*0.3+getPrecioBase();
            setPrecioBase(aunmentoPrecio);
        }
        System.out.println(getPrecioBase());
        return getPrecioBase();
    }
}
