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