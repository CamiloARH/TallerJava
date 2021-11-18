package TallerEvaluacionJava;

import java.util.Scanner;
//Ejercicio 4

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        Double number1 = capture.nextDouble();
        Double impuesto = (number1*0.21)+number1;

        System.out.println("El precio total del producto mas IVA es de: "+ impuesto);
    }
}
