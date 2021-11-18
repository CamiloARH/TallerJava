package TallerEvaluacionJava;

import java.util.Scanner;

//Ejercicio 3

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        Double number1 = capture.nextDouble();

        System.out.println("El area del circulo es: " + Math.PI*Math.pow(number1,2));
    }
}
