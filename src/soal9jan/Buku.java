package soal9jan;

public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String penulis;
    private int stok;

    public Buku (String kodeBuku, String judulBuku, String penulis, int stok){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.stok = stok;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }


    public int getStok() {
        return stok;
    }


    // Metode untuk mengurangi stok
    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    // Metode untuk menambah stok
    public void tambahStok() {
        stok++;
    }

    @Override
    public String toString() {
        return "Kode: " + kodeBuku + ", Judul: " + judulBuku + ", Penulis: " + penulis + ", Stok: " + stok;
    }

}

