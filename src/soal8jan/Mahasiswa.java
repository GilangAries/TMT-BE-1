package soal8jan;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        // Validasi NIM
        if (nim.length() < 5) {
            throw new IllegalArgumentException("NIM harus memiliki minimal 5 karakter.");
        }
        this.nim = nim;

        this.nama = nama;
        this.jurusan = jurusan;

        // Validasi IPK
        if (ipk < 0 || ipk > 4) {
            throw new IllegalArgumentException("IPK harus di antara 0 dan 4.");
        }
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan + ", IPK: " + ipk;
    }
}
