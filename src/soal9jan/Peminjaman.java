package soal9jan;

public class Peminjaman {
    private String namaPeminjam;
    private Buku bukuDipinjam;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(String namaPeminjam, Buku bukuDipinjam, String tanggalPinjam, String tanggalKembali){
        this.namaPeminjam = namaPeminjam;
        this.bukuDipinjam = bukuDipinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    @Override
    public String toString() {
        return "Nama Peminjam: " + namaPeminjam + ", Buku: " + bukuDipinjam.getJudulBuku() +
                ", Tanggal Pinjam: " + tanggalPinjam + ", Tanggal Kembali: " + tanggalKembali;
    }


}
