package TallerEvaluacionJava;


import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio1y2 {
    //        Ejercicio 1 y 2
    public static void main(String[] args) {


        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer number1 = capture.nextInt();
        System.out.println("Ingrese un numero: ");
        Integer number2 = capture.nextInt();

        if (number1 > number2){
            System.out.println("El numero mayor es: " + number1);
        }else if (number1 < number2){
            System.out.println("El numero mayor es: " + number2);
        }else {
            System.out.println("los dos numeros: " + number1 +" y "+ number2+" son iguales");
        }
    }
}
