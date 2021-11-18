package TallerEvaluacionJava;

// Ejercicio 17

public class Electrodomesticos {

    int kPeso=5;

    private double precioBase= 100;
    private String color= "Blanco";
    private char consumoEnergetico = 'F';
    private Integer peso = kPeso;

    public Electrodomesticos() {
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }
    public Electrodomesticos(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Electrodomesticos(Integer precioBase, String color, char consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarLetra(){
        switch (consumoEnergetico){
            case 'A' ->setConsumoEnergetico('A');
            case 'B' ->setConsumoEnergetico('B');
            case 'C' ->setConsumoEnergetico('C');
            case 'D' -> setConsumoEnergetico('D');
            case 'E' -> setConsumoEnergetico('E');
            default ->setConsumoEnergetico('F');
        }
    }
    public void comprobarColor(){
        switch (color){
            case "NEGRO" ->setColor("NEGRO");
            case "ROJO" ->setColor("ROJO");
            case "AZUL" ->setColor("AZUL");
            case "GRIS" ->setColor("GRIS");
            default ->setColor("BLANCO");
        }
    }

    public double precioFinal(){
        int baseLetra= 0;
        int basePeso = 0;
        if (consumoEnergetico=='A'){
            baseLetra=100;
        }else if(consumoEnergetico=='B'){
            baseLetra= 80;
        }else if(consumoEnergetico=='C'){
            baseLetra= 60;
        }else if(consumoEnergetico=='D'){
            baseLetra=50;
        }else if(consumoEnergetico=='E'){
            baseLetra=30;
        }else if(consumoEnergetico=='F'){
            baseLetra=10;
        }
        if(peso >= 0 || peso <=19){
            basePeso = 10;
        }else if (peso >= 20 || peso <=49){
            basePeso = 50;
        }else if (peso >= 50 || peso <=79){
            basePeso = 80;
        }else if (peso >= 80){
            basePeso = 100;
        }
        this.setPrecioBase(baseLetra+basePeso);
        return getPrecioBase();
    }

}
