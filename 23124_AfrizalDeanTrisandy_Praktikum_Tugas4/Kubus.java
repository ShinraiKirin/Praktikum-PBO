public class Kubus extends Balok {
    double s;
    
    public void SetData(double s) {
        this.s = s;
    }
    public double volume() {
        return s*s*s;
    }

    public double luasPermukaan() {
        return 6*s*s;
    }
}
