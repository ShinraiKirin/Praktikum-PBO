package nomor2;
public class perulangan {

    public void baris1() {
        for (int angka = 0; angka < 5; angka++) {
            if (angka == 0) {
                System.out.print("\t");
            } else {
                System.out.print(angka + "\t");
            }
        }
    }

    public void baris2345(){
        System.out.println();
        for (int angka = 1; angka < 5; angka++) {
            System.out.print(angka + "\t");
            for (int a = 1; a < 5; a++) {
                System.out.print((angka * a) + "\t");
            }
            System.out.println();
        }
    }
}