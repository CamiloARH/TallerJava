package TallerEvaluacionJava;

import java.util.Scanner;

//        Ejercicio 7

public class Ejercicio7 {
    public static void main(String[] args) {


        Scanner capture = new Scanner(System.in);
        Integer number1 = 0;
        do {
            System.out.println("Ingrese un numero: ");
            number1 = capture.nextInt();
        } while(number1 < 0);

        System.out.println("El numero: "+number1+" es mayor o igual a cero");
    }
}
