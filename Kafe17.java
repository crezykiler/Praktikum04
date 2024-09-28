import java.util.Scanner;

public class Kafe17 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;

    System.out.print("Masukkan menu(Kopi, Teh, Coklat): ");
    menu = sc.nextLine();
    System.out.print("Masukkan ukuran cup(S, M, L): ");
    ukuranCup = sc.next().charAt(0);
    System.out.print("Masukkan jumlah: ");
    jumlah = sc.nextInt();
    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();

    double hargaMenu = 0;

    switch (menu.toLowerCase()) {
        case "kopi":
            hargaMenu = 12000;
            break;
        case "teh":
            hargaMenu = 7000;
            break;
        case "coklat":
            hargaMenu = 20000;
            break;
    }
    double totalHarga = hargaMenu * jumlah;
    boolean ukuranValid = true;

    switch (ukuranCup) {
        case 'S':
            break;
        case 'M':
        totalHarga += 0.25 * totalHarga;
            break; 
        case 'L':
        totalHarga += 0.50 * totalHarga;
            break;
        default:
        System.out.println("Size yang dipilih tidak tersedia.");
        ukuranValid = false;
            break;
    }

    double diskon = keanggotaan ? 0 : 0.1;
    double nominalBayar = totalHarga - (diskon * totalHarga);

    if (ukuranValid) {
    System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
    System.out.println("Nominal bayar: " + nominalBayar);
    }
  }
}