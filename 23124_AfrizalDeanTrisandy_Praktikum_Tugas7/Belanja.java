import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Toko toko = new Toko();
        Transaksi transaksi = new Transaksi();
        Scanner input = new Scanner(System.in);

        toko.tampilkandaftarbarang();
        System.out.print("Masukkan Jumlah Item yang Dibeli: ");
        int jumlahItem = input.nextInt();

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            Barang barang = toko.caribarang(kode);

            if (barang != null) {
                System.out.print("Masukkan Jumlah Beli: ");
                int jumlah = input.nextInt();
                transaksi.tambahPembelian(barang, jumlah);
            } else {
                System.out.println("Kode Barang tidak valid!");
            }
        }

        transaksi.tampilkanPembelian(toko);
    }
}
