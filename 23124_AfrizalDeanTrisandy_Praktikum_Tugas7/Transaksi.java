import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private List<String> kodeBeli = new ArrayList<>();
    private List<Integer> jumlahBeli = new ArrayList<>();
    private List<Integer> hargaTotal = new ArrayList<>();
    private int totalBayar = 0;

    public void tambahPembelian(Barang barang, int jumlah) {
        kodeBeli.add(barang.getKode());
        jumlahBeli.add(jumlah);
        int subtotal = barang.getHarga() * jumlah;
        hargaTotal.add(subtotal);
        totalBayar += subtotal;
    }

    public void tampilkanPembelian(Toko toko) {
        System.out.println("\nDaftar Pembelian:");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("=============================================================");

        for (int i = 0; i < kodeBeli.size(); i++) {
            Barang barang = toko.caribarang(kodeBeli.get(i));
            int jumlah = jumlahBeli.get(i);
            int subtotal = hargaTotal.get(i);
            System.out.printf("%-3d %-12s %-12s %-7d %-12d %-12d\n",
                    (i + 1), barang.getKode(), barang.getNama(), barang.getHarga(), jumlah, subtotal);
        }

        System.out.println("=============================================================");
        System.out.println("Total Bayar: " + totalBayar);
    }

    public int getTotalBayar() {
        return totalBayar;
    }
}
