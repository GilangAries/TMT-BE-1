package soal1;

public class Main {
    public static void main(String[] args) {
        try {
            // Membuat 2 objek soal1.Barang
            Barang barang1 = new Barang("B001", "buku", 2000.0);
            Barang barang2 = new Barang("B002", "Buku", -1);

            // Membuat 2 objek soal1.Transaksi
            Transaksi transaksi1 = new Transaksi(barang1, 1);
            Transaksi transaksi2 = new Transaksi(barang2, 3);

            // Menampilkan detail transaksi
            transaksi1.tampilkanDetail();
            transaksi2.tampilkanDetail();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}