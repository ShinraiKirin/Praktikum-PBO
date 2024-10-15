package Tugas1;

public class Data {
    public String Nama, Npm, Keterangan, Grading;
    public double NilaiUts, NilaiUas, NilaiKehadiran, NilaiTugas;

    public void GetData() {
        double NilaiAkhir = (0.10 * NilaiKehadiran) + (0.20 * NilaiTugas) + (0.30 * NilaiUts) + (0.40 * NilaiUas);
        if (NilaiAkhir >= 76) {
            Grading = "A";
            Keterangan = "ISTIMEWA";
        } else if (NilaiAkhir >= 66) {
            Grading = "B";
            Keterangan = "BAIK";
        } else if (NilaiAkhir >= 56) {
            Grading = "C";
            Keterangan = "CUKUP";
        } else if (NilaiAkhir >= 46) {
            Grading = "D";
            Keterangan = "KURANG";
        } else {
            Grading = "E";
            Keterangan = "KURANG SEKALI";
        }

        System.out.println("Data yang telah diinput:");
        System.out.println("NPM: " + Npm);
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("Nilai Kehadiran: " + NilaiKehadiran);
        System.out.println("Nilai Tugas: " + NilaiTugas);
        System.out.println("Nilai UTS: " + NilaiUts);
        System.out.println("Nilai UAS: " + NilaiUas);
        System.out.println("Nilai Akhir: " + NilaiAkhir);
        System.out.println("Grade: " + Grading);
        System.out.println("Keterangan: " + Keterangan);
    }
}