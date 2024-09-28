import java.util.Scanner;

public class Login17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password ;

        System.out.print("Masukkan username: ");
        username = sc.nextLine();
        System.out.print("Masukkan password: ");
        password = sc.nextLine();

        if (username.equals("ZakiHacker") && password.equals(username)) {
            System.out.println("Selamat datang " + username + " ke situs kami");
        }
        else {
            System.out.println("Username dan sandi salah mohon coba lagi");
        }
    }
}