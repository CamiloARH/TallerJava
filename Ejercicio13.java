package TallerEvaluacionJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    // Ejercicio 13

    public static void main(String[] args) {
        System.out.println("Este es el formato que se manejara de fecha y hora (AAAA/MM/DD) (HH:MM:SS): ");
        DateTimeFormatter horaDiaActual = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(horaDiaActual.format(LocalDateTime.now()));

    }
}
