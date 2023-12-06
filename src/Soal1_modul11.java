import java.util.Scanner;
public class Soal1_modul11 {
    public static void main(String[] args) {
        int[] nilai;
        nilai = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Menyimpan 5 data bulat ke array nilai
        nilai[0] = 45;
        nilai[1] = 75;
        nilai[2] = 80;
        nilai[3] = 78;
        nilai[4] = 93;

        //Menampilkan data dari akhir ke awal
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +" adalah "+nilai[4-i]);

    }
}