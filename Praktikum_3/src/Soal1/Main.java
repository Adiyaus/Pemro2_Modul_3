package Soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Dadu> daduList = new LinkedList<>();
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = input.nextInt();


        if (jumlahDadu == 1) {
            daduList.add(new Dadu(2));
        } else if (jumlahDadu == 3) {
            daduList.add(new Dadu(2));
            daduList.add(new Dadu(3));
            daduList.add(new Dadu(5));
        } else if (jumlahDadu == 4) {
            daduList.add(new Dadu(1));
            daduList.add(new Dadu(3));
            daduList.add(new Dadu(6));
            daduList.add(new Dadu(1));
        } else {
            System.out.println("Jumlah dadu tidak sesuai dengan skenario yang diinginkan.");
            return;
        }


        int total = 0;
        for (int i = 0; i < daduList.size(); i++) {
            Dadu dadu = daduList.get(i);
            int nilai = dadu.getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            total += nilai;
        }


        System.out.println("Total nilai dadu keseluruhan: " + total);
    }
}
