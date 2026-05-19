public class Main {
    public static void main(String[] args) {

        Trokut trokut1 = new Trokut( "trokut 1", 0, 0, 0);
        Krug krug1 = new Krug( "krug 1", 0);
        Pravokutnik pravokutnik1 =  new Pravokutnik( "pravokutnik 1", 0, 0);

        trokut1.setStranica1(20); //postavljanje nove vrijednosti putem settera
        trokut1.setStranica2(10);
        trokut1.setStranica3(40);
        krug1.setRadijus(15);
        pravokutnik1.setStranica1(20);
        pravokutnik1.setStranica2(40);

        trokut1.prikazPodatakaTrokut();
        krug1.prikazPodatakaKrug();
        pravokutnik1.prikazPodatakaPravokutnik();

    }
}
