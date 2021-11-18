package TallerEvaluacionJava;

import java.util.Scanner;

public class Ejercicio14 {

    //        Ejercicio 14

    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 1000: ");
        Integer incicio = capture.nextInt();

        for(int i=incicio; i<=1000;i= i+2){
            if (i==999){
                System.out.println(i+1);
            }else {
                System.out.println(i+", ");
            }
        }

    }
}
