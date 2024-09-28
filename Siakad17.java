import java.util.Scanner;

public class Siakad17 {

    public static void main(String[] args) {
        Scanner Mulyono = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = Mulyono.nextLine();
        System.out.print("Masukkan nim: ");
        nim = Mulyono.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = Mulyono.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = Mulyono.nextByte();

        System.out.print("Masukkan nilai kuis: " );
        nilaiKuis = Mulyono.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = Mulyono.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = Mulyono.nextDouble();
    
        nilaiAkhir = (nilaiKuis * 0.30) + (nilaiTugas * 0.30) + (nilaiUjian * 0.40);

        System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim + " kelas : " + kelas.toUpperCase() + " nomor absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat Baik");
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi: Lebih dari Baik");
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: Baik");
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari Cukup");
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi: Cukup");
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: Kurang");
        } else if (nilaiAkhir < 39) {
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi: Gagal");
        } else {
            System.out.println("Nilai tidak valid.");
        }
    }
}