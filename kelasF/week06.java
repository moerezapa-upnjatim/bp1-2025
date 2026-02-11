import java.util.Scanner;

public class week06 {
    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        // System.out.print("Masukkan kode Program Studi Anda: ");
        // int kodeProdi = scannerInput.nextInt();

        // switch(kodeProdi) {
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
        //         System.out.println("Kode Anda salah :(");
        //         break;
        // }

        // for(inisialisasi variabel; condition; update)
        // for(int pengulangan =1; pengulangan <= 5; pengulangan++) {
        //     System.out.println(pengulangan + ". Hello my Name is Migon");
        // }

        // System.out.println("=============");
        // for(int pengulangan =100; pengulangan >=90; pengulangan--) {
        //     System.out.println(pengulangan + ". Hello my Name is Migon");
        // }

        // potd -3
        // for (int angka = 0; angka <= 100; angka+= 2) {
        //     System.out.println("Angka ke-" + angka);
        // }

        // int angkaPerulangan = 0;
        // while(angkaPerulangan <= 100) {
        //     System.out.println("Angka ke-" + angkaPerulangan);

        //     angkaPerulangan = angkaPerulangan + 2;
        // }
        // do {
        //     System.out.println("Angka ke-" + angkaPerulangan);

        //     angkaPerulangan = angkaPerulangan + 2;
        // } while(angkaPerulangan <= 100);

        // System.out.print("Silahkan masukkan password: ");
        // String passwordUser = scannerInput.next();

        // while(!passwordUser.equals("ahay")) {
        //     System.out.print("Password Anda salah. Silahkan masukkan kembali: ");

        //     passwordUser = scannerInput.next();
        // }
        
        String passwordUser = "";
        do {
            System.out.print("Silahkan masukkan password: ");
            passwordUser = scannerInput.next();
        } while(!passwordUser.equals("ahay"));

        System.out.println("Password Anda benar");
    }
}