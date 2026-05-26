import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Implementirajte baznu klasu GeometrijskiLik, te refaktorirajte klase Pravokutnik, Trokut i Krug na način da odgovaraju specifikaciji zadatka.

        Ucilica ucilica = new Ucilica();

        Trokut trokut1 = new Trokut( "zeleni", 9, 14, 8);
        Krug krug1 = new Krug( "Veeliki", 5);
        Pravokutnik pravokutnik1 =  new Pravokutnik( "plavi", 9, 14);

//        System.out.println(krug1);
//        System.out.println(pravokutnik1);
//        System.out.println(trokut1);

        ucilica.getLikovi().add(pravokutnik1);
        ucilica.getLikovi().add(trokut1);
        ucilica.getLikovi().add(krug1);

        for (GeometrijskiLik gl : ucilica.getLikovi()){
            System.out.println(gl);
        }
        System.out.println("Sortiranje i ispis");
        Collections.sort(ucilica.getLikovi());
        for (GeometrijskiLik gl : ucilica.getLikovi()){
            System.out.println(gl);
        }
    }
}
