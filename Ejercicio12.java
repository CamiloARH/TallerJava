package TallerEvaluacionJava;

import java.util.Scanner;

public class Ejercicio12 {

    // Ejercicio 12

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese un palabra: ");
        String word1 = capture.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String word2 = capture.nextLine();
        int x;
        char letra1 = 0, letra2 = 0;


        if (word1.equals(word2)){
            System.out.println("Las dos palabras son iguales");
        }else if(word1.length() == word2.length()){
            x = word2.length();
            for(int i=0; i<x; i++){
                letra1 = word1.charAt(i);
                letra2 = word2.charAt(i);
                if (letra1!=letra2){
                    System.out.println("La letra: '"+letra1+"' no conincide");
                }
            }
        }else if(word1.length() != word2.length()) {
            System.out.println("Tienen diferentes tamaños");
        }

    }
}
