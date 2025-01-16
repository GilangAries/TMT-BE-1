package soal1;

public class Transaksi {
    Barang barang;
    int jumlah;
    double totalHarga;

    // validasi
    public Transaksi(Barang barang, int jumlah) {
        if (barang == null) {
            throw new IllegalArgumentException("soal1.Barang tidak boleh null.");
        }
        this.barang = barang;
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah barang harus lebih besar dari 0.");
        }
        this.jumlah = jumlah;
        this.hitungTotal();
    }

    // menghitung total harga
    public void hitungTotal() {
        this.totalHarga = this.jumlah * this.barang.harga;
    }

    // menampilkan detail transaksi
    public void tampilkanDetail() {
        System.out.println("Kode soal1.Barang: " + this.barang.kodeBarang);
        System.out.println("Nama soal1.Barang: " + this.barang.namaBarang);
        System.out.println("Harga soal1.Barang: " + this.barang.harga);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Total Harga: " + this.totalHarga);
        System.out.println("---------------------------------");
    }
}