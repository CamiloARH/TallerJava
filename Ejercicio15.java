package TallerEvaluacionJava;

import java.util.Scanner;

public class Ejercicio15 {

    //        Ejercicio 15

    public static void main(String[] args) {
        int opcion;
        Scanner opciones = new Scanner(System.in);

        do {
            System.out.println("************** GESTION CINEMATOGRAFICA **************");
            System.out.println("  1-NUEVO ACTOR");
            System.out.println("  2-BUSCAR ACTOR");
            System.out.println("  3-ELIMINAR ACTOR");
            System.out.println("  4-MODIFICAR ACTOR");
            System.out.println("  5-VER TODOS LOS ACTORES");
            System.out.println("  6-VER PELICULAS DE LOS ACTORES");
            System.out.println("  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("  8-SALIR............ ");
            System.out.println("");
            System.out.print("Por favor escoja una de las opciones :");

            opcion = opciones.nextInt();

            if (opcion<1 || opcion>8){
                System.out.println("");
                System.out.println("Opcion Incorrecta, por favor vuelve e intenta");
                System.out.println("");
            }
        } while (opcion<8 || opcion>8);
    }
}

