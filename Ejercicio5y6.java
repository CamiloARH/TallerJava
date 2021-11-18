package TallerEvaluacionJava;

public class Ejercicio5y6 {

    //Ejercicio 5 y 6

    public static void main(String[] args) {
        int impares = 1;
        int pares = 0;
        String numerosPar="";
        String numerosImp="";

        System.out.println("Numeros con While:");
        while(impares<=100){
            pares=impares+1;
            numerosPar =  numerosPar+", "+pares;
            numerosImp =  numerosImp+", "+impares;
            impares= impares+2;
        }
        System.out.println(numerosImp+"\n"+numerosPar);
        System.out.println("");
        System.out.println("******************************************************************************************");
        System.out.println("Numero impares con For:");


        for(int i=1; i<=100;i= i+2){
            System.out.print(i+", ");
            System.out.println(i+1);
        }
    }
}
