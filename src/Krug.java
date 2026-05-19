public class Krug {
    private String naziv;
    private double radijus;

    //konstruktor

    public Krug(String naziv, double radijus) {
        this.naziv = naziv;
        this.radijus = radijus;
    }

    //getter

    public String getNaziv() {
        return naziv;
    }

    public double getRadijus() {
        return radijus;
    }

    //setter

    public void setRadijus(double radijus) {
        if (radijus > 0.0) {
            this.radijus = radijus;
        }
    }

    public String prikazPodatakaKrug() {
        return "Naziv: " + naziv + ", radijus: " + radijus ;
    }
}
