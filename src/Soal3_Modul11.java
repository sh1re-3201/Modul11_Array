import java.util.Scanner;

public class Soal3_Modul11 {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);
        int[] skor;
        int[] cadangan = new int[5];
        skor = new int[5];
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            skor[i] = aria.nextInt();
        }
        System.arraycopy(skor, 0, cadangan, 0, skor.length);

        //Menampilkan data dari akhir ke awal
        System.out.println("Isi dari Array skor");
        for(int i=0; i <= 4; i++) {
            System.out.println("Data ke "+ (i+1) +" adalah "+skor[4-i]);
        }
        System.out.println("Isi dari Array cadangan");
        for(int i=0; i <= 4; i++) {
            System.out.println("Data ke "+ (i+1) +" adalah "+cadangan[4-i]);
        }
    }
}
