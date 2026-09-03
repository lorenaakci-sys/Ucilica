import java.util.Arrays;

public class Main {

    static void main (String[] args) {

        GeometrijskiLik[] likovi = {
                new Krug("Zeleni krug", 6),
                new Trokut("Plavi trokut", 8, 5, 6),
                new Pravokutnik("Žuti pravokutnik", 7, 9)
        };

        Arrays.sort(likovi);

        for (int i = 0; i < likovi.length; i++) {
            System.out.println(likovi[i].getNaziv() + " = " + likovi[i].povrsina());
        }
    }
}
