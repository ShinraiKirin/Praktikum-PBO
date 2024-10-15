package nomor1.a;
public class perulangan {
    public void prima(int put) {
        for (int a = 0; a <= 20; a++) {
            if (a < 2) {
                System.out.println(a + " bukan prima.");
            } else {
                boolean prima = true;
                for (int b = 2; b < a; b++) {
                    if (a % b == 0) {
                        prima = false;
                        break;
                    }
                }
                if (prima) {
                    System.out.println(a + " adalah bilangan prima.");
                } else {
                    System.out.println(a + " bukan prima.");
                }
            }
        }
    }
}