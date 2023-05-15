package latihan.index.nilai;

// Deklarasi 
interface HasilAkhir {
    void getIndexNilai(double na);
}

// Deklarasi kelas Mahasiswa
class Mahasiswa {
    // Deklarasi atribut dari kelas Mahasiswa
    protected double quiz, uts, uas, na;
    protected char index = 0;
    protected String keterangan = null;
    protected String nama;
    protected String nim;

    // Deklarasi constructor untuk kelas Mahasiswa
    Mahasiswa(String nama, String nim, double quiz, double uts, double uas) {
        // Inisialisasi atribut nama, nim, quiz, uts, dan uas
        this.nim = nim;
        this.nama = nama;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    // Method getter untuk atribut quiz
    public double getQuiz() {
        return quiz;
    }
    
    // Method getter untuk atribut uts
    public double getUts() {
        return uts;
    }

    // Method getter untuk atribut uas
    public double getUas() {
        return uas;
    }

    // Method getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Method getter untuk atribut nim
    public String getNim() {
        return nim;
    }

    // Method untuk menghitung nilai akhir (na)
    public double getNilaiAkhir() {
        na = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
        return na;
    }
}

// Deklarasi kelas MahasiswaLulus yang merupakan turunan dari kelas Mahasiswa
class MahasiswaLulus extends Mahasiswa {
    // Deklarasi constructor untuk kelas MahasiswaLulus yang memanggil constructor
    // superclass
    MahasiswaLulus(String nama, String nim, double quiz, double uts, double uas) {
        super(nama, nim, quiz, uts, uas);
    }

    // Implementasi method dari interface HasilAkhir untuk menghitung index nilai
    // dan keterangan
    public void getIndexNilai(double na) {
        // Menentukan index dan keterangan berdasarkan nilai akhir (na)
        if (na <= 45) {
            index = 'E';
            keterangan = "Sangat Kurang";
        } else if (na <= 56) {
            index = 'D';
            keterangan = "Kurang";
        } else if (na <= 68) {
            index = 'C';
            keterangan = "Cukup";
        } else if (na <= 80) {
            index = 'B';
            keterangan = "Baik";
        } else if (na <= 100) {
            index = 'A';
            keterangan = "Sangat Baik";
        }
        // Menampilkan index dan keterangan
        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + keterangan);
    }
}