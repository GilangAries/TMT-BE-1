import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataKontak {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan kontak baru");
            System.out.println("2. Tampilkan semua kontak");
            System.out.println("3. Cari kontak berdasarkan nama");
            System.out.println("4. Hapus kontak berdasarkan nama");
            System.out.println("5. Update nomor telepon berdasarkan nama");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Menambahkan kontak baru
                    System.out.print("\nMasukkan nama kontak baru: ");
                    String newName = scanner.nextLine();
                    String lowerCaseName = newName.toLowerCase();
                    String finalLowerCaseName = lowerCaseName;
                    while (contacts.keySet().stream().anyMatch(name -> name.toLowerCase().equals(finalLowerCaseName))) {
                        System.out.println("Nama kontak sudah ada. Masukkan nama lain.");
                        System.out.print("Masukkan nama kontak baru: ");
                        newName = scanner.nextLine();
                        lowerCaseName = newName.toLowerCase();
                    }
                    System.out.print("Masukkan nomor telepon baru: ");
                    String newPhone = scanner.nextLine();
                    contacts.put(newName, newPhone);
                    System.out.println("Kontak baru berhasil ditambahkan.");
                    break;

                case 2:
                    // Menampilkan semua kontak
                    System.out.println("\nDaftar Kontak:");
                    if (contacts.isEmpty()) {
                        System.out.println("Tidak ada kontak yang tersimpan.");
                    } else {
                        for (Map.Entry<String, String> entry : contacts.entrySet()) {
                            System.out.println("Nama: " + entry.getKey() + ", Nomor Telepon: " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    // Menampilkan kontak berdasarkan nama
                    System.out.print("\nMasukkan nama kontak yang dicari: ");
                    String searchName = scanner.nextLine();
                    String foundContact = contacts.entrySet().stream()
                            .filter(entry -> entry.getKey().equalsIgnoreCase(searchName))
                            .map(Map.Entry::getValue)
                            .findFirst()
                            .orElse(null);
                    if (foundContact != null) {
                        System.out.println("Nomor Telepon: " + foundContact);
                    } else {
                        System.out.println("Kontak tidak ditemukan.");
                    }
                    break;

                case 4:
                    // Menghapus kontak berdasarkan nama
                    System.out.print("\nMasukkan nama kontak yang ingin dihapus: ");
                    String deleteName = scanner.nextLine();
                    String deleteKey = contacts.keySet().stream()
                            .filter(name -> name.equalsIgnoreCase(deleteName))
                            .findFirst()
                            .orElse(null);
                    if (deleteKey != null) {
                        contacts.remove(deleteKey);
                        System.out.println("Kontak berhasil dihapus.");
                    } else {
                        System.out.println("Kontak tidak ditemukan.");
                    }
                    break;

                case 5:
                    // Mengupdate nomor telepon berdasarkan nama
                    System.out.print("\nMasukkan nama kontak yang ingin diupdate: ");
                    String updateName = scanner.nextLine();
                    String updateKey = contacts.keySet().stream()
                            .filter(name -> name.equalsIgnoreCase(updateName))
                            .findFirst()
                            .orElse(null);
                    if (updateKey != null) {
                        System.out.print("Masukkan nomor telepon baru: ");
                        String newPhoneUpdate = scanner.nextLine();
                        contacts.put(updateKey, newPhoneUpdate);
                        System.out.println("Nomor telepon berhasil diupdate.");
                    } else {
                        System.out.println("Kontak tidak ditemukan.");
                    }
                    break;

                case 6:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
