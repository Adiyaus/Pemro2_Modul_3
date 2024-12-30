package Soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Negara> negaraList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = input.nextInt();
        input.nextLine(); 
        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Nama Negara: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kepemimpinan: ");
            String jenisKePemimpinan = input.nextLine();
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = input.nextLine();
            if (jenisKePemimpinan.equals("monarki")) {
                negaraList.add(new Negara(nama, jenisKePemimpinan, namaPemimpin));
            } else {
                System.out.print("Tanggal Merdeka: ");
                int tanggalMerdeka = input.nextInt();
                System.out.print("Bulan Merdeka: ");
                int bulanMerdeka = input.nextInt();
                System.out.print("Tahun Merdeka: ");
                int tahunMerdeka = input.nextInt();
                input.nextLine(); 
                negaraList.add(new Negara(nama, jenisKePemimpinan, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka));
            }
        }
        for (Negara negara : negaraList) {
            negara.display();
        }
        input.close();
    }
}
