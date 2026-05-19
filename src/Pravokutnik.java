public class Pravokutnik {
    private String naziv;
    private double stranica1;
    private double stranica2;

    public Pravokutnik(String naziv, double stranica1, double stranica2) {
        this.naziv = naziv;
        this.stranica1 = stranica1;
        this.stranica2 = stranica2;
    }

    public double getStranica1() {
        return stranica1;
    }

    public double getStranica2() {
        return stranica2;
    }

    public void setStranica2(double stranica2) {
        if (stranica2 > 0.0) {
            this.stranica2 = stranica2;
        }
    }

    public void setStranica1(double stranica1) {
        if (stranica1 > 0.0) {
            this.stranica1 = stranica1;
        }

    }

    public String prikazPodatakaPravokutnik() {
        return "Naziv: " + naziv + ", stranica 1: " + stranica1 + ", stranica 2: " + stranica2;
    }
}
