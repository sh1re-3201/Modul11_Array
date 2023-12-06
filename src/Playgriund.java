import java.util.Scanner;

public class Playgriund {
    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);

        // Memasukkan jumlah mahasiswa (minimal 10)
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = aria.nextInt();

        // Deklarasi array untuk menyimpan data mahasiswa
        String[] nimArray = new String[jumlahMahasiswa];
        String[] namaArray = new String[jumlahMahasiswa];
        double[] us1Array = new double[jumlahMahasiswa];
        double[] us2Array = new double[jumlahMahasiswa];
        double[] uasArray = new double[jumlahMahasiswa];
        double[] totalNilArray = new double[jumlahMahasiswa];
        char[] finalNilArray = new char[jumlahMahasiswa];

        // Memasukkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            boolean validInput = false;
            while (!validInput) {
                System.out.print("NIM: ");
                String nimArrayInput = aria.next();
                // Check if the input contains letters
                if (nimArrayInput.matches(".*[a-zA-Z]+.*")) {
                    System.out.println("NIM tidak boleh mengandung huruf. Silakan coba lagi.");
                } else {
                    nimArray[i] = nimArrayInput;
                    validInput = true;
                }
            }
            System.out.print("Nama: ");
            namaArray[i] = aria.next();
            System.out.print("US1: ");
            us1Array[i] = aria.nextDouble();
            System.out.print("US2: ");
            us2Array[i] = aria.nextDouble();
            System.out.print("UAS: ");
            uasArray[i] = aria.nextDouble();

            // Menghitung nilai total
            totalNilArray[i] = hitungTotalNilai(us1Array[i], us2Array[i], uasArray[i]);

            // Menghitung nilai huruf
            finalNilArray[i] = konversiNilai(totalNilArray[i]);
        }

        // Menampilkan daftar nilai mahasiswa
        System.out.println("Daftar Nilai Mahasiswa TI USD");
        tampilkanDaftarNilai(nimArray, namaArray, us1Array, us2Array, uasArray, totalNilArray, finalNilArray);

        // Mengurutkan data berdasarkan nilai total
        bubbleSortDescending(totalNilArray, nimArray, namaArray, us1Array, us2Array, uasArray, finalNilArray);

        // Menampilkan daftar nilai mahasiswa urut terbaik
        System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik");
        tampilkanDaftarNilai(nimArray, namaArray, us1Array, us2Array, uasArray, totalNilArray, finalNilArray);
    }

    // Fungsi untuk menghitung nilai total
    private static double hitungTotalNilai(double us1, double us2, double uas) {
        return (0.3 * us1) + (0.3 * us2) + (0.4 * uas);
    }

    // Fungsi untuk mengkonversi nilai total ke nilai huruf
    private static char konversiNilai(double totalNil) {
        if (totalNil >= 80) {
            return 'A';
        } else if (totalNil >= 65) {
            return 'B';
        } else if (totalNil >= 55) {
            return 'C';
        } else if (totalNil >= 45) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Fungsi untuk menampilkan daftar nilai mahasiswa
    private static void tampilkanDaftarNilai(String[] nim, String[] nama, double[] us1, double[] us2, double[] uas,
                                             double[] totalNil, char[] finalNil) {
        System.out.println("===============================================================================");
        System.out.printf("| %-4s | %-12s | %-15s | %-3s | %-3s | %-3s | %-5s | %-5s |\n",
                "No.", "NIM", "Nama", "US1", "US2", "UAS", "Total", "Final");
        System.out.println("===============================================================================");

        for (int i = 0; i < nim.length; i++) {
            System.out.printf("| %-4d | %-12s | %-15s | %-3.0f | %-3.0f | %-3.0f | %-5.2f | %-5c |\n",
                    i + 1, nim[i], nama[i], us1[i], us2[i], uas[i], totalNil[i], finalNil[i]);
        }

        System.out.println("===============================================================================");
    }

    // Fungsi untuk mengurutkan data dengan algoritma Bubble Sort (descending)
    private static void bubbleSortDescending(double[] totalNil, String[] nim, String[] nama, double[] us1, double[] us2,
                                             double[] uas, char[] finalNil) {
        int n = totalNil.length;
        boolean adaPenukaran;

        do {
            adaPenukaran = false;

            for (int i = 0; i < n - 1; i++) {
                if (totalNil[i] < totalNil[i + 1]) {
                    // Tukar elemen jika tidak terurut
                    tukarElemen(totalNil, i, i + 1);
                    tukarElemen(nim, i, i + 1);
                    tukarElemen(nama, i, i + 1);
                    tukarElemen(us1, i, i + 1);
                    tukarElemen(us2, i, i + 1);
                    tukarElemen(uas, i, i + 1);
                    tukarElemen(finalNil, i, i + 1);

                    adaPenukaran = true;
                }
            }
        } while (adaPenukaran);
    }

    // Fungsi untuk menukar elemen dalam array
    private static void tukarElemen(double[] arr, int indeks1, int indeks2) {
        double temp = arr[indeks1];
        arr[indeks1] = arr[indeks2];
        arr[indeks2] = temp;
    }

    private static void tukarElemen(String[] arr, int indeks1, int indeks2) {
        String temp = arr[indeks1];
        arr[indeks1] = arr[indeks2];
        arr[indeks2] = temp;
    }

    private static void tukarElemen(char[] arr, int indeks1, int indeks2) {
        char temp = arr[indeks1];
        arr[indeks1] = arr[indeks2];
        arr[indeks2] = temp;
    }
}
