import java.util.Scanner;

public class Soal2_Modul11 {
    public static void main(String[] args) {
        int[] skor;
        skor = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            skor[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +" adalah "+skor[4-i]);

    }
}
