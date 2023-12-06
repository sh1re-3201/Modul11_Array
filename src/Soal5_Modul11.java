import java.util.Arrays;
import java.util.Scanner;

public class Soal5_Modul11 {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);
        double[] skor;
        double[] cadangan = new double[5];
        skor = new double[5];
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
        double rerata = Arrays.stream(skor).average().orElse(Double.NaN);
        System.out.println("Rata-rata      : " + rerata);

        double maks = Arrays.stream(skor).max().orElseThrow();
        System.out.println("Nilai maksimum : " + maks);

        double min = Arrays.stream(skor).min().orElseThrow();
        System.out.println("Nilai minimum  : " + min);
    }
}
