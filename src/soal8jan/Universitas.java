package soal8jan;

import java.util.ArrayList;

public class Universitas {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Metode untuk menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(m.getNim())) {
                System.out.println("Mahasiswa dengan NIM " + m.getNim() + " sudah ada.");
                return;
            }
        }
        daftarMahasiswa.add(m);
        System.out.println("Mahasiswa berhasil ditambahkan: " + m);
    }

    // Metode untuk mencari mahasiswa
    public void cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                System.out.println("NIM: " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("Jurusan: " + mahasiswa.getJurusan());
                System.out.println("IPK: " + mahasiswa.getIpk());
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    // Metode untuk menampilkan semua mahasiswa
    public void tampilkanSemuaMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println("NIM: " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("Jurusan: " + mahasiswa.getJurusan());
                System.out.println("IPK: " + mahasiswa.getIpk());
                System.out.println("---------------------------------");
            }
        }
    }
}
