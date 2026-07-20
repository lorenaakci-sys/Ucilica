public class Krug {

    private String naziv;
    private int radijus;

    public Krug(String naziv, int radijus) {
        this.naziv = naziv;
        this.radijus = radijus;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getRadijus() {
        return this.radijus;
    }

    public void setRadijus(int radijus) {
        this.radijus = radijus;
    }

    public double opseg() {
        return 2 * this.radijus * Math.PI;
    }

    public double povrsina() {
        return Math.pow(this.radijus, 2) * Math.PI;
    }
}
