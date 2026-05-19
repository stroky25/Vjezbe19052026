public class Trokut {
    private String naziv;
    private double stranica1;
    private double stranica2;
    private double stranica3;

    // konstruktor

    public Trokut(String naziv, double stranica1, double stranica2, double stranica3) {
        this.naziv = naziv;
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
        this.stranica3 = stranica3;
    }

    // getter
    public double getStranica1() {
        return stranica1;
    }

    public double getStranica2() {
        return stranica2;
    }

    public double getStranica3() {
        return stranica3;
    }

    public String getNaziv() {
        return naziv;
    }

    //setter
    public void setStranica1(double stranica1) {
        if (stranica1 > 0.0) {
            this.stranica1 = stranica1;
        }
    }

    public void setStranica2(double stranica2) {
        if (stranica2 > 0.0) {
            this.stranica2 = stranica2;
        }
    }

    public void setStranica3(double stranica3) {
        if (stranica3 > 0.0) {
            this.stranica3 = stranica3;
        }
    }

    public String prikazPodatakaTrokut() {
        return "Naziv: " + naziv + ", stranica 1: " + stranica1 + ", stranica 2: " + stranica2 + ", stranica 3: " + stranica3;
    }
}
