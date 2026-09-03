public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik>{

    String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double opseg();

    public abstract double povrsina();
}
