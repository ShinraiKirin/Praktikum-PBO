public class IMT {
    public double tinggiBadan;
    public double beratBadan;
    public double imt;
    public double tinggimeter;
    public String Kriteria;

    public void HitungIMT() {
        tinggimeter = tinggiBadan / 100;
        imt = beratBadan / (tinggimeter * tinggimeter);
        if (imt <= 18.4) {
            Kriteria="Barat Badan Kurang";
        }
        else if (imt <= 24.9) {
            Kriteria="Berat Badan Ideal";
        }
        else if (imt <= 29.9) {
            Kriteria="Berat Badan Lebih";
        }
        else if (imt <= 39.9) {
            Kriteria="Gemuk";
        }
        else {
            Kriteria="Sangat Gemuk";
        }
        System.out.println("IMT anda: " + imt);
        System.out.println("Kriteria anda: " + Kriteria);
    }
}