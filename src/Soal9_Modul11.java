import java.util.Scanner;

public class Soal9_Modul11 {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);

        System.out.print("Banyak elemen: ");
        int n = aria.nextInt();

        int[] x = new int[n];

        // Membaca elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen-" + (i + 1) + ": ");
            x[i] = aria.nextInt();
        }

        // Menampilkan elemen array sebelum diurutkan
        System.out.print("Elemen sebelum pengurutan: ");
        mencetakArray(x);

        // Mengurutkan elemen array menggunakan Bubble Sort
        pengurutan(x);

        // Menampilkan elemen array setelah diurutkan
        System.out.print("Elemen setelah pengurutan: ");
        mencetakArray(x);
    }

    // Fungsi untuk menampilkan isi array
    private static void mencetakArray(int[] x) {
        for (int nilai : x) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    // Fungsi untuk mengurutkan array menggunakan Bubble Sort
    private static void pengurutan(int[] x) {
        int n = x.length;
        boolean adaPenukaran;

        do {
            adaPenukaran = false;

            for (int i = 0; i < n - 1; i++) {
                if (x[i] > x[i + 1]) {
                    // Tukar elemen jika tidak terurut
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;

                    adaPenukaran = true;
                }
            }
        } while (adaPenukaran);
    }
}
