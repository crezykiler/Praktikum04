import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        int biaya = 0;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Selamat datang di sistem parkir!");
            System.out.println("Silakan pilih jenis kendaraan yang akan diparkir:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");
            pilihan = input.nextLine();

            switch (pilihan) {
                case "1":  
                    biaya = 5000; 
                    System.out.println("Anda memilih: Mobil");
                    System.out.println("Biaya parkir per jam: Rp " + biaya);
                    break;
                case "2":  
                    biaya = 3000; 
                    System.out.println("Anda memilih: Motor");
                    System.out.println("Biaya parkir per jam: Rp " + biaya);
                    break;
                case "3":  
                    System.out.println("Terima kasih telah menggunakan sistem parkir kami. Sampai jumpa!");
                    ulang = false;
                    continue;  
                default: 
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            System.out.print("Berapa jam Anda akan memarkir kendaraan? ");
            int jam = input.nextInt();
            input.nextLine();  

            int totalBiaya = biaya * jam;
            System.out.println("Total biaya parkir untuk " + jam + " jam: Rp " + totalBiaya);
            System.out.println();

            System.out.print("Apakah Anda ingin memarkir kendaraan lain? (y/n): ");
            String ulangPilihan = input.nextLine();

            if (ulangPilihan.equalsIgnoreCase("n")) {
                ulang = false;
                System.out.println("Terima kasih telah menggunakan sistem parkir kami. Sampai jumpa!");
            }
        }

        input.close();
    }
}
