package TallerEvaluacionJava;
import java.util.Scanner;

public class TestPersona {

//    Ejercicio 16 parte 2

    public static void main(String[] args) {

        String nombre, nombre2, nombre3;
        int edad, edad2, edad3;
        char sexo, sexo2, sexo3;
        double peso, peso2, peso3;
        double altura, altura2, altura3;

        Persona persona1, persona2, persona3;

        //persona 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Digita su Nombre: ");
        nombre = sc.nextLine().toUpperCase();
        System.out.println("Digite la edad: ");
        edad =  Integer.parseInt(sc.nextLine());
        System.out.println("Diguite su sexo: H/M ");
        sexo = sc.nextLine().charAt(0);
        System.out.println("diguite su peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("diguite su altura: ");
        altura = Double.parseDouble(sc.nextLine());

        persona1= new Persona(nombre,edad,sexo,peso,altura);
        persona1.mayorDeEdad();
        persona1.avisoPeso(persona1);
        System.out.println(persona1.toString());


//persona 2

        System.out.println("Digita su Nombre: ");
        nombre2 = sc.nextLine().toUpperCase();
        System.out.println("Digite la edad: ");
        edad2 =  Integer.parseInt(sc.nextLine());
        System.out.println("Diguite su sexo: H/M ");
        sexo2 = sc.nextLine().charAt(0);
        System.out.println("diguite su peso: ");
        peso2 = Double.parseDouble(sc.nextLine());
        System.out.println("diguite su altura: ");
        altura2 = Double.parseDouble(sc.nextLine());

        persona2 = new Persona();
        persona2.setNombre(nombre2);
        persona2.setSexo(sexo2);
        persona2.setEdad(edad2);
        persona2.setAltura(altura2);
        persona2.setPeso(peso2);
        persona2.mayorDeEdad();
        persona2.avisoPeso(persona2);
        System.out.println(persona2.toString());

//persona 3

        System.out.println("Digita su Nombre: ");
        nombre3 = sc.nextLine().toUpperCase();
        System.out.println("Digite la edad: ");
        edad3 =  Integer.parseInt(sc.nextLine());
        System.out.println("Diguite su sexo: H/M ");
        sexo3 = sc.nextLine().charAt(0);
        System.out.println("diguite su peso: ");
        peso3 = Double.parseDouble(sc.nextLine());
        System.out.println("diguite su altura: ");
        altura3 = Double.parseDouble(sc.nextLine());

        persona3= new Persona(nombre3,edad3,sexo3,peso3,altura3);
        persona3.mayorDeEdad();
        persona3.avisoPeso(persona3);
        System.out.println(persona3.toString());
    }
}



