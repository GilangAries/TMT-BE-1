package soal8jan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universitas universitas = new Universitas();

        Mahasiswa m1 = new Mahasiswa("20523112", "Tuti tulung tikar", "Teknik Informatika", 3.75);
        Mahasiswa m2 = new Mahasiswa("20524112", "Sunaryo AC", "Sistem Informasi", 3.50);
        Mahasiswa m3 = new Mahasiswa("20525112", "yanto bengkel", "Teknik Elektro", 3.90);
        Mahasiswa m4 = new Mahasiswa("20525112", "yanto ac", "Sastra mesin", 3.90);

        universitas.tambahMahasiswa(m1);
        universitas.tambahMahasiswa(m2);
        universitas.tambahMahasiswa(m3);
       universitas.tambahMahasiswa(m4);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();
                    System.out.print("Masukkan IPK: ");

                    double ipk = scanner.nextDouble();
                    scanner.nextLine();

                    try {
                        Mahasiswa m = new Mahasiswa(nim, nama, jurusan, ipk);
                        universitas.tambahMahasiswa(m);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNim = scanner.nextLine();
                    universitas.cariMahasiswa(cariNim);
                    break;
                case 3:
                    universitas.tampilkanSemuaMahasiswa();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
