package Tugas1;

import java.util.Scanner;

public class DataBeraksi {
    
    public static void main(String[] args) {
        Data data = new Data();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        data.Npm = input.nextLine();
        System.out.print("Masukkan Nama: ");
        data.Nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        data.NilaiKehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        data.NilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        data.NilaiUts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        data.NilaiUas = input.nextDouble();
        data.GetData();


        input.close();
    }
}