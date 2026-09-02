public class Krug extends GeometrijskiLik {

    private int radijus;

    public Krug(String naziv, int radijus) {
        super(naziv);
        this.radijus = radijus;
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
