public class Main {

    static void main (String[] args) {

        Krug krug = new Krug("Plavi krug", 6);
        Trokut trokut = new Trokut("Crveni trokut", 9, 7, 5);
        Pravokutnik pravokutnik = new Pravokutnik("Zeleni pravokutnik", 6, 12);

        GeometrijskiLik lik = new Krug("Žuti krug", 11);

        System.out.println("Naziv: " + krug.getNaziv() + ", Opseg: " + krug.opseg() + ", Površina: " + krug.povrsina());
        System.out.println("Naziv: " + trokut.getNaziv() + ", Opseg: " + trokut.opseg() + ", Površina: " + trokut.povrsina());
        System.out.println("Naziv: " + pravokutnik.getNaziv() + ", Opseg: " + pravokutnik.opseg() + ", Površina: " + pravokutnik.povrsina());
        System.out.println("Naziv: " + lik.getNaziv() + ", Opseg: " + lik.opseg() + ", Površina: " + lik.povrsina());
    }
}
