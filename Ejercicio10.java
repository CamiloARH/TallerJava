package TallerEvaluacionJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

//    Ejercicio 10

    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String text = capture.nextLine();

        System.out.println(text.replace(" ",""));
    }
}
