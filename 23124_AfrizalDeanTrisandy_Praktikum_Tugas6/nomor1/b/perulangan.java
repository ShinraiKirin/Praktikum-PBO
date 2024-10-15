package nomor1.b;

public class perulangan {
        public void ganjilGenap(int put){ 
        for (int i = 0; i <= put; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " adalah bilangan ganjil.");
            } else {
                System.out.println(i + " adalah bilangan genap.");
            }
        }
    }
}