public class Pravokutnik extends GeometrijskiLik{
    //private String naziv;
    private double stranica1;
    private double stranica2;

//    public double opseg {
//        return 1;
//    }

    @Override
    public double opseg() {
        //return 0;
        return 2 * stranica1 + 2 * stranica2;
    }


    @Override
    public double povrsina() {
        return stranica1 * stranica2;
    }


    //    public Pravokutnik(String naziv, double stranica1, double stranica2) {
//        this.naziv = naziv;
//        this.stranica1 = stranica1;
//        this.stranica2 = stranica2;
//    }

    public Pravokutnik(String naziv, double stranica1, double stranica2) {
        super(naziv);
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
    }




}
