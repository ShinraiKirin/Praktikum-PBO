import java.util.ArrayList;
import java.util.List;

public class Toko {
    private List<Barang> daftarBarang = new ArrayList<>();

    public Toko() {
        daftarBarang.add(new Barang("a001", "Buku", 3000));
        daftarBarang.add(new Barang("a002", "Pensil", 4000));
        daftarBarang.add(new Barang("a003", "Pulpen", 5000));
    }

    public Barang caribarang(String kode) {
        for (Barang barang : daftarBarang) {
            if (barang.getKode().equalsIgnoreCase(kode)) {
                return barang;
            }
        }
        return null;
    }

    public void tampilkandaftarbarang() {
        System.out.println("No  Kode Barang  Nama Barang  Harga");
        System.out.println("===================================");
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang barang = daftarBarang.get(i);
            System.out.printf("%-3d %-12s %-12s %-7d\n", (i + 1), barang.getKode(), barang.getNama(), barang.getHarga());
        }
        System.out.println("===================================");
    }
}
