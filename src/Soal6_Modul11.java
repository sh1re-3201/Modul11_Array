import java.util.Scanner;

public class Soal6_Modul11 {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);
        int[] A = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78};
        int nilaiPilih;

        System.out.print("Masukkan nilai yang di cari : ");
        nilaiPilih = aria.nextInt();


        int cariPos = cariPosisiNilai(A, nilaiPilih);

        if (cariPos != -1){
            System.out.println("Nilai yang dicari : " + nilaiPilih);
            System.out.println("Berada di index   : " + cariPos);
        } else {
            System.out.println("Nilai tidak ada di dalam array");
        }

    }
    static int cariPosisiNilai(int[] array, int nilai){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nilai){
                return i;
            }
        }
        return -1;
    }
}
