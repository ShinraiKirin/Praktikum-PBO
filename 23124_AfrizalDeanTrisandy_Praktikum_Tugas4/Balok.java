public class Balok {
    double p,l,t ;

    public void SetData(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public double volume() {
        return p*l*t;
    }

    public double luasPermukaan() {
        return 2*(p*l + p*t + l*t);
    }
}
