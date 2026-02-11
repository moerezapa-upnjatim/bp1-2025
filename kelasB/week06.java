import java.util.Scanner;

public class week06 {
    
    public static void main(String[] args) {
        
        // int kodeProdiDelap = 70;

        // switch (kodeProdiDelap) {
        //     case 61:
        //         System.out.println("Program Studi Anda adalah Informatika");
        //         break;
        //     case 62:
        //         System.out.println("Program Studi Anda adalah Sistem Informasi");
        //         break;
        //     case 63:
        //         System.out.println("Program Studi Anda adalah Sains Data");
        //         break;
        //     case 64:
        //         System.out.println("Program Studi Anda adalah Bisnis Digital");
        //         break;
        //     case 65:
        //         System.out.println("Program Studi Anda adalah Magister Teknologi Informasi");
        //         break;
        //     default:
        //         System.out.println("Kode Anda salah!");
        //         break;

        // }

        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");
        // System.out.println("Hello my Name is BIMA");

        // for (int perulangan =0; perulangan <= 5; perulangan ++) {
        //     System.out.println(perulangan + ". Hello my Name is BIMA");
        // }

        for (int perulangan = 10; perulangan >= 5; perulangan--) {
            System.out.println(perulangan + ". Hello my Name is BIMA");
        }

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Silahkan masukkan Angka Anda: ");
        // int jumlahPerulangan = scanner.nextInt();

        // for (int i = 1; i <= jumlahPerulangan; i++) {
        //     System.out.println("Angka ke-" + i);
        //     // System.out.print("Angka ke-" + i);
        // }

        // for (int i = 0; i <= 100; i++) {
        //     if (i % 2 == 0)
        //         System.out.println("Angka ke-" + i);
        // }

        // for (int i = 0; i <= 100; i+=2) {
        //     System.out.println("Angka ke-" + i);
        // }

        int angka = 101;
        while (angka <= 100) {
            System.out.println("Angka ke-" + angka);
            angka+=2;
        }

        do {
            System.out.println("Angka ke-" + angka);
            angka+=2;
        } while (angka <= 100);

        System.out.print("Silahkan masukkan password: ");
        String passwordUser = scanner.nextLine();
        
        while (!passwordUser.equals("hehe")) { 
            System.out.print("Passwordnya salah. Silahkan masukkan password: ");
            passwordUser = scanner.nextLine();
        }
    }
}
