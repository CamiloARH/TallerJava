package TallerEvaluacionJava;

import java.util.Scanner;

//      Ejercicio 8

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana: ");
        String day = capture.next().toUpperCase();

        switch (day){
            case "LUNES","MARTES","MIERCOLES","JUEVES","VIERNES" -> System.out.println("Es un dia laboral");
            case "SABADO","DOMINGO" -> System.out.println("No es un dia laboral");
            default -> System.out.println("Ese día no existe");

        }
    }
}
