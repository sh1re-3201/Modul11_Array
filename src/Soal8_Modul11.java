public class Soal8_Modul11 {
    public static void main(String[] args) {
        int[] Bil = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};

        // Pisahkan anggota Genap dan Ganjil
        int[] bilGenap = new int[Bil.length];
        int[] bilGanjil = new int[Bil.length];

        int indeksGenap = 0;
        int indeksGanjil = 0;

        for (int nilai : Bil) {
            if (nilai % 2 == 0) {
                bilGenap[indeksGenap++] = nilai;
            } else {
                bilGanjil[indeksGanjil++] = nilai;
            }
        }

        // Mencetak anggota bilGenap
        System.out.println("Anggota Genap:");
        tampilkanArray(bilGenap, indeksGenap);

        // Mencetak anggota bilGanjil
        System.out.println("\nAnggota Ganjil:");
        tampilkanArray(bilGanjil, indeksGanjil);
    }

    // Fungsi untuk menampilkan isi array
    static void tampilkanArray(int[] x, int panjang) {
        for (int i = 0; i < panjang; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
