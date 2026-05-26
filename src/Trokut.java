public class Trokut extends GeometrijskiLik {
    //private String naziv;
    private double stranica1;
    private double stranica2;
    private double stranica3;

    // konstruktor


    public Trokut(String naziv, double stranica1, double stranica2, double stranica3) {
        super(naziv);
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
        this.stranica3 = stranica3;
    }

    @Override
    public double opseg() {
        return stranica1 + stranica2 + stranica3;
    }

    @Override
    public double povrsina() {
        //Heronova formula
        double s = (stranica1 + stranica2 + stranica3) / 2.0;
        return Math.sqrt(s * (s - stranica1) * (s - stranica2) * (s - stranica3));
    }
}
