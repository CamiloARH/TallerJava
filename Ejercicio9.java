package TallerEvaluacionJava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Ejercicio 9

        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String text = capture.next();
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        System.out.println(frase.replace("a","e")+ text);
    }
}
