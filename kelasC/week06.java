import java.util.Scanner;

public class week06 {
    public static void main(String[] args) {
        // int kodeTiket = 62;
        // switch (kodeTiket)  {
        //     case 61:
        //         System.out.println("Prodi Anda adalah Informatika");
        //         break;
        //     case 62:
        //         System.out.println("Prodi Anda adalah Sistem Informasi");
        //         break;
        //     case 63:
        //         System.out.println("Prodi Anda adalah Sains Data");
        //         break;
        //     case 64:
        //         System.out.println("Prodi Anda adalah Bisnis Digital");
        //         break;
        //     case 65:
        //         System.out.println("Prodi Anda adalah Magister Teknologi Informasi");
        //         break;
        // }

        // System.out.println("Hello My Name is Ferdi");
        // System.out.println("Hello My Name is Ferdi");
        // System.out.println("Hello My Name is Ferdi");
        // System.out.println("Hello My Name is Ferdi");
        // System.out.println("Hello My Name is Ferdi");

        // for (inisialisasi; kondisi; update)
        // for(int perulangan = 1; perulangan <= 100; perulangan ++) {
        //     System.out.println(perulangan + ". Hello My Name is Ferdi");
        // }
        
        // for(int perulangan = 100; perulangan >=90; perulangan --) {
        //     System.out.println(perulangan + ". Hello My Name is Ferdi");
        // }

        Scanner scannerUser = new Scanner(System.in);
        // System.out.print("Masukkan jumlah perulangan: ");
        // int jumlahPerulangan = scannerUser.nextInt();
        
        // for (int nomorperulangan = 1; nomorperulangan <= jumlahPerulangan; nomorperulangan+=2) {
        //     System.out.println("Angka ke-"+nomorperulangan);
        // }

        int jumlahPerulangan = 20;
        while (jumlahPerulangan <= 10) {
            System.out.println("Angka ke-"+jumlahPerulangan);

            jumlahPerulangan += 3;
        }

        do {
            System.out.println("Angka ke-"+jumlahPerulangan);

            jumlahPerulangan += 3;
        } while (jumlahPerulangan <= 10);

        System.out.print("Silahkan masukkan password: ");
        String passwordPengguna = scannerUser.next();

        while(!passwordPengguna.equals("hehe")) {
            System.out.print("Password Anda salah. Silahkan masukkan dengan benar: ");

            passwordPengguna = scannerUser.next();
        }
    }
}
