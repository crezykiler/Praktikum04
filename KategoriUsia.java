import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.print("Masukkan usia Anda (atau ketik 'keluar' untuk berhenti): ");
            
            if (input.hasNextInt()) {
                int usia = input.nextInt();
                input.nextLine(); 

                if (usia < 0) {
                    System.out.println("Usia harus merupakan angka positif.");
                } else {
                    if (usia >= 0 && usia <= 12) {
                        System.out.println("Kategori: Anak");
                    } else if (usia >= 13 && usia <= 19) {
                        System.out.println("Kategori: Remaja");
                    } else if (usia >= 20 && usia <= 64) {
                        System.out.println("Kategori: Dewasa");
                    } else if (usia >= 65) {
                        System.out.println("Kategori: Lansia");
                    }
                }
            } else {
                String teks = input.nextLine();

                if (teks.equalsIgnoreCase("keluar")) {
                    ulang = false;
                    System.out.println("Terima kasih, sampai jumpa!");
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka positif.");
                }
            }
        }

        input.close();
    }
}
