import java.util.Scanner;

public class IMTBeraksi {
    public static void main(String[] args) {
        IMT imt = new IMT();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Badan: ");
        imt.tinggiBadan = input.nextDouble();
        System.out.print("Masukkan Berat Badan: ");
        imt.beratBadan = input.nextDouble();
        imt.HitungIMT();
        input.close();
    }
}
