public class Soal7_Modul11 {
    public static void main(String[] args) {
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};

        // Menghitung panjang array gabungan
        int usiaGabungPanjang = usia1.length + usia2.length;

        // Membuat array usiaGabung dengan panjang yang sesuai
        int[] usiaGabung = new int[usiaGabungPanjang];

        // Variabel untuk indeks array usiaGabung
        int usiaGabungIndeks = 0;

        // Menggabungkan dua array secara terurut
        int indeksUsia1 = 0;
        int indeksUsia2 = 0;

        while (indeksUsia1 < usia1.length && indeksUsia2 < usia2.length) {
            if (usia1[indeksUsia1] < usia2[indeksUsia2]) {
                usiaGabung[usiaGabungIndeks++] = usia1[indeksUsia1++];
            } else {
                usiaGabung[usiaGabungIndeks++] = usia2[indeksUsia2++];
            }
        }

        // Menyalin sisa elemen dari usia1 (jika ada)
        while (indeksUsia1 < usia1.length) {
            usiaGabung[usiaGabungIndeks++] = usia1[indeksUsia1++];
        }

        // Menyalin sisa elemen dari usia2 (jika ada)
        while (indeksUsia2 < usia2.length) {
            usiaGabung[usiaGabungIndeks++] = usia2[indeksUsia2++];
        }

        // Menampilkan array usiaGabung setelah diurutkan
        System.out.println("\nArray usiaGabung setelah diurutkan:");
        mencetakArray(usiaGabung);
    }

    // Fungsi untuk menampilkan isi array
    private static void mencetakArray(int[] x) {
        for (int isi : x) {
            System.out.print(isi + " ");
        }
        System.out.println();
    }
}
