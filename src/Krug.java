public class Krug extends GeometrijskiLik {
    //private String naziv;
    private double radijus;

    @Override
    public double opseg() {
        return 2 * radijus * Math.PI;
    }

    @Override
    public double povrsina() {
        return Math.pow(radijus, 2) * Math.PI;
    }

//konstruktor

    public Krug(String naziv, double radijus) {
        super(naziv);
        this.radijus = radijus;
    }



}
