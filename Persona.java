package TallerEvaluacionJava;

//Ejercicio 16

public class Persona {

    private String nombre;
    private int edad;
    private String dni = "0";
    char constanteSexo = 'h';
    private char sexo = constanteSexo;
    private double peso;
    private double altura;


    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        dni=generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni=generarDNI();
    }

    public Persona() {
        dni=generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {

        double imc = (peso / (Math.pow(altura, 2)));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;

        } else {
            return 1;
        }
    }

    public boolean mayorDeEdad() {

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            return true;
        } else {
            System.out.println("No eres mayor de edad");
            return false;
        }

    }

    protected void comprobarSexo() {

        switch (sexo) {
            case 'm' -> setSexo('m');
            default -> setSexo('h');
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    protected String generarDNI() {
        int n = 99999999;
        int numero = (int) (Math.random() * n) + 1;

        char letra = generarLetra(numero);

        String dniCompleta = "" + numero + letra;


        return dniCompleta;
    }

    protected char generarLetra(int numero) {

        if (numero < 23) {
            numero = 23;
        }

        int modVariable = numero % 23;

        switch (modVariable) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'w';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                return 'T';
        }
    }
    public static void avisoPeso(Persona persona){
        int valorImc = persona.calcularIMC();
        if (valorImc == -1) {
            System.out.println("Su peso esta bien");
        } else if (valorImc == 0) {
            System.out.println("Esta bajo de peso");
        } else {
            System.out.println("Tiene un peso elevado, sobrepeso");
        }
    }
}
