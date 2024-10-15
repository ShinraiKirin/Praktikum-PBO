package nomor1.d;

public class perulangan {
    public void AnakAyam() {
        System.out.println("tek kotek kotek kotek");
        System.out.println("anak ayam turunlah berkotek");
        for (int n = 4; n > 1; n--) {
            System.out.println("anak ayam turunlah " + n);
            System.out.println("mati satu tinggallah " + (n - 1));
        }
        System.out.println("anak ayam turunlah 1");
        System.out.println("mati satu tinggallah induknya");
    }
}