public class Nilai {
    float NilaiA;
    float NilaiT;
    float NilaiUTS;
    float NilaiUAS;
    float NilaiAkhir;
    String NIM;
    String NAMA;

    float Nilai(){
        NilaiAkhir=(NilaiA*10/100)+(NilaiT*10/100)+(NilaiUTS*30/100)+(NilaiUAS*40/100);
        return NilaiAkhir;
    }
    void CetakNilai(){
        System.out.println("NIM                 : "+NIM);
        System.out.println("NAMA                : "+NAMA);
        System.out.println("Nilai Absen         : "+NilaiA);
        System.out.println("Nilai Tugas         : "+NilaiT);
        System.out.println("Nilai UTS           : "+NilaiUTS);
        System.out.println("Nilai UAS           : "+NilaiUAS);
        System.out.println("Nilai Akhir         : "+Nilai());
    }
}