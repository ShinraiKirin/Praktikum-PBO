package Tugas2;

import java.util.Scanner;

public class DiskonBeraksi {
    public static void main(String[] args) {
        Diskon diskon = new Diskon();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total yang dibayarkan RP.");
        diskon.TotalPembelian = input.nextDouble();
        diskon.HitungDiskon();
        input.close();
    }
}
