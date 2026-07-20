public class Pravokutnik {

    private String naziv;
    private int a;
    private int b;

    public Pravokutnik(String naziv, int a, int b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double povrsina() {
        return a * b;
    }

    public double opseg() {
        return 2 * (a+b);
    }
}
