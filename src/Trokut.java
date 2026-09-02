public class Trokut extends GeometrijskiLik {

    private int a;
    private int b;
    private int c;

    public Trokut(String naziv, int a, int b, int c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return this.c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double opseg() {
        return a + b + c;
    }

    public double povrsina() {
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

}
