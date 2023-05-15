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