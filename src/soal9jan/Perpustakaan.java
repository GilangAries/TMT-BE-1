package soal9jan;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Perpustakaan() {

        daftarBuku.add(new Buku("B001", "Java Programming", "James Gosling", 5));
        daftarBuku.add(new Buku("B002", "Clean Code", "Robert C. Martin", 5));
        daftarBuku.add(new Buku("B003", "Dilan 1991", "Pidi Baiq", 5));
    }

    // Lihat Daftar Buku
    public void lihatDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    // Pinjam Buku
    public void pinjamBuku() {
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();

        System.out.print("Masukkan kode buku: ");
        String kodeBuku = scanner.nextLine();

        System.out.print("Masukkan tanggal pinjam (YYYY-MM-DD): ");
        String tanggalPinjam = scanner.nextLine();

        System.out.print("Masukkan tanggal kembali (YYYY-MM-DD): ");
        String tanggalKembali = scanner.nextLine();

        Buku bukuDipinjam = null;

        // Cari buku berdasarkan kode
        for (Buku buku : daftarBuku) {
            if (buku.getKodeBuku().equals(kodeBuku)) {
                bukuDipinjam = buku;
                break;
            }
        }

        if (bukuDipinjam == null) {
            System.out.println("Buku dengan kode " + kodeBuku + " tidak ditemukan.");
            return;
        }

        if (bukuDipinjam.getStok() > 0) {
            bukuDipinjam.kurangiStok();
            daftarPeminjaman.add(new Peminjaman(namaPeminjam, bukuDipinjam, tanggalPinjam, tanggalKembali));
            System.out.println("Buku '" + bukuDipinjam.getJudulBuku() + "' berhasil dipinjam oleh " + namaPeminjam);
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }
    }

    // Lihat Transaksi Peminjaman (Menggunakan toString)
    public void lihatTransaksiPeminjaman() {
        System.out.println("Daftar Transaksi Peminjaman:");
        for (Peminjaman pinjam : daftarPeminjaman) {
            System.out.println(pinjam.toString());
        }
    }

    // Kembalikan Buku
    public void kembalikanBuku() {
        System.out.print("Masukkan kode buku yang ingin dikembalikan: ");
        String kodeBuku = scanner.nextLine();

        Buku bukuDikembalikan = null;

        for (Buku buku : daftarBuku) {
            if (buku.getKodeBuku().equals(kodeBuku)) {
                bukuDikembalikan = buku;
                break;
            }
        }

        if (bukuDikembalikan != null) {
            bukuDikembalikan.tambahStok();
            System.out.println("Buku '" + bukuDikembalikan.getJudulBuku() + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    // Main Method
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Lihat Transaksi Peminjaman");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1 -> perpustakaan.lihatDaftarBuku();
                case 2 -> perpustakaan.pinjamBuku();
                case 3 -> perpustakaan.lihatTransaksiPeminjaman();
                case 4 -> perpustakaan.kembalikanBuku();
                case 5 -> System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
