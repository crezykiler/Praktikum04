import java.util.Scanner;

public class LampuLaluLintas17 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String warna;

        System.out.print("Masukkan warna(merah, kuning, hijau): ");
        warna = sc.nextLine().toLowerCase();

        if (warna.equals ("merah")) {
            System.out.println("Berhenti dibelakang marka garis lampu lalu lintas");
        }
        else if (warna.equals ("kuning")) {
            System.out.println("Hati-hati dan kurangi kecepatan");
        }
        else if (warna.equals ("hijau")) {
            System.out.println("Jalan");
        }
        else{
            System.out.println("inputan tidak valid");
        }
    }
}