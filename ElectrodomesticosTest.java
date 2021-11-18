package TallerEvaluacionJava;

// Ejercicio 17 Ejecutable

import java.util.ArrayList;

public class ElectrodomesticosTest {
    public static void main(String[] args) {


        Electrodomesticos nevera =new Electrodomesticos(150, "NEGRO",'E',55);
        Electrodomesticos estufa =new Electrodomesticos(60, "GRIS",'A',15);
        Lavadora lavadora1 = new Lavadora(100, "ROJO",'B',55,20);
        Lavadora lavadora2 = new Lavadora(150, "NEGRO",'D',85,50);
        Lavadora lavadora3 = new Lavadora(80, "AZUL",'A',45,10);
        Lavadora lavadora4 = new Lavadora(200, "BLANCO",'B',105,100);
        Television television1 = new Television(150, "NEGRO",'B',40,50,true);
        Television television2 = new Television(100, "BLANCO",'C',30,30,false);
        Television television3 = new Television(120, "NEGRO",'B',35,40,true);
        Television television4 = new Television(90, "NEGRO",'B',20,20,true);


        ArrayList<Electrodomesticos> Electrodomesticos = new ArrayList();
        Electrodomesticos.add(nevera);
        Electrodomesticos.add(estufa);
        Electrodomesticos.add(lavadora1);
        Electrodomesticos.add(lavadora2);
        Electrodomesticos.add(lavadora3);
        Electrodomesticos.add(lavadora4);
        Electrodomesticos.add(television1);
        Electrodomesticos.add(television2);
        Electrodomesticos.add(television3);
        Electrodomesticos.add(television4);

        Electrodomesticos.stream().forEach(electrodomestico-> System.out.println(electrodomestico.precioFinal()));

        double precioElectro=0;
        double precioLavadora=0;
        double precioTelevision=0;
        double precioTotal=0;
        precioElectro= nevera.precioFinal()+estufa.precioFinal();
        precioLavadora=lavadora1.precioFinal()+lavadora2.precioFinal()+lavadora3.precioFinal()+lavadora4.precioFinal();
        precioTelevision=television1.precioFinal()+television2.precioFinal()+television3.precioFinal()+television4.precioFinal();
        precioTotal=precioElectro+precioLavadora+precioTelevision;
        System.out.println("El precio de la estufa y de la nevera es de: "+precioElectro);
        System.out.println("El precio de las lavadoras es de: "+ precioLavadora);
        System.out.println("El precio de los televisores es de: "+ precioTelevision);
        System.out.println("El precio de todos los electrodomesticos es de: "+ precioTotal);

    }
}
