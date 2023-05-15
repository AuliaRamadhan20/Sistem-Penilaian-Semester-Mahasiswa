package latihan.index.nilai;

// Mengimport package Scanner untuk membaca input dari pengguna
import java.util.Scanner;

// Membuat class MahasiswaLulusLagi yang merupakan subclass dari class Mahasiswa
class MahasiswaLulusLagi extends Mahasiswa {

    // Konstruktor untuk class MahasiswaLulusLagi yang mengambil parameter nama,
    // nim, quiz, uts, dan uas
    MahasiswaLulusLagi(String nama, String nim, double quiz, double uts, double uas) {
        // Memanggil konstruktor superclass dengan menggunakan kata kunci "super"
        super(nama, nim, quiz, uts, uas);
    }

    // Method getIndexNilai untuk menentukan indeks dan keterangan lulus/tidak lulus
    // berdasarkan nilai akhir yang diterima
    public void getIndexNilai(double na) {
        // Jika nilai akhir lebih besar atau sama dengan 60, maka indeksnya adalah A dan
        // keterangan adalah "Lulus"
        if (na >= 60) {
            System.out.println("Index = " + 'A');
            System.out.println("Keterangan : Lulus");
        } else {
            // Jika tidak, indeksnya adalah E dan keterangan adalah "Tidak Lulus"
            System.out.println("Index = " + 'E');
            System.out.println("Keterangan : Tidak Lulus");
        }
    }
}