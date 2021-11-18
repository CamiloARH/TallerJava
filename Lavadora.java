package TallerEvaluacionJava;

// Ejercicio 17 Lavadora

public class Lavadora extends Electrodomesticos {
    private Integer carga  = 5;


    public Lavadora() {

    }
    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Integer precioBase, String color, char consumoEnergetico, Integer peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    public Integer getCarga() {
        return carga;
    }
    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        super.precioFinal();
        if (carga>=30){
            setPrecioBase(50+getPrecioBase());
            System.out.println(getPrecioBase());
        }
        return getPrecioBase();
    }
}
