package TallerEvaluacionJava;

import java.util.Scanner;

public class Ejercicio11 {

//    Ejercicio 11

    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String text = capture.nextLine();
        System.out.println("El tamaño de la frase que escribiste es de: "+text.length());
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (char letra: text.toCharArray ()) {
            if (letra == 'a'){
                a++;
            }
            if (letra == 'e'){
                e++;
            }
            if (letra == 'i'){
                i++;
            }
            if (letra == 'o'){
                o++;
            }
            if (letra == 'u'){
                u++;
            }
        }
        System.out.println ("Total de A en la frase son: "+a);
        System.out.println ("Total de E en la frase son: "+e);
        System.out.println ("Total de I en la frase son: "+i);
        System.out.println ("Total de O en la frase son: "+o);
        System.out.println ("Total de U en la frase son: "+u);
    }
}
