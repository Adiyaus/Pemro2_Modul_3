package Soal2;
import java.util.HashMap;
public class Negara {
    private String nama, jenisKePemimpinan, namaPemimpin;
    private int tanggalMerdeka, bulanMerdeka, tahunMerdeka;
    private HashMap<Integer, String> bulan;

    public Negara(String nama, String jenisKePemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKePemimpinan = jenisKePemimpinan;
        this.namaPemimpin = namaPemimpin;
    }
    public Negara(String nama, String jenisKePemimpinan, String namaPemimpin, int tanggalMerdeka, int bulanMerdeka, int tahunMerdeka) {
        this.nama = nama;
        this.jenisKePemimpinan = jenisKePemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalMerdeka = tanggalMerdeka;
        this.bulanMerdeka = bulanMerdeka;
        this.tahunMerdeka = tahunMerdeka;
        bulan = new HashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
    }
    public void display() {
        if (jenisKePemimpinan.equals("monarki")) {
            System.out.println();
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
            System.out.println();
        }
        else{
            System.out.println("Negara " + nama + " mempunyai Presiden bernama " + namaPemimpin + " Deklarasi Kemerdekaan Pada Tanggal " + tanggalMerdeka + " " + bulan.get(bulanMerdeka) + " " + tahunMerdeka);
            System.out.println();
        }
    }
    
}
