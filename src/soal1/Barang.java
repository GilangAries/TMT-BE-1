package soal1;

public class Barang {
    String kodeBarang;
    String namaBarang;
    double harga;

    // validasi
    public Barang(String kodeBarang, String namaBarang, double harga) {
        if (kodeBarang == null || kodeBarang.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode barang tidak boleh kosong.");
        }
        if (namaBarang == null || namaBarang.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga barang tidak boleh negatif.");
        }
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
}