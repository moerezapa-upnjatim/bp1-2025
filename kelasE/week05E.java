import java.util.Scanner;

public class week05E {
    
    public static void main(String[] args) {
        
        // potd -1
        // int uangDitarik = 100000;
        // int saldoHato = 57000;

        // if (uangDitarik < saldoHato)
        //     System.out.println("Mohon ditunggu. Silahkan ambil uang Anda");
        // else
        //     System.out.println("Maaf uang Anda tidak cukup.");

        // potd-2
        Scanner scannerUser = new Scanner(System.in);
        System.out.print("Silahkan masukkan Tahun Lahir Anda: ");
        int tahunLahir = scannerUser.nextInt();

        if (tahunLahir > 2013)
            System.out.println("Anda termasuk Gen Alpha");
        else if (tahunLahir > 1996)
            System.out.println("Anda termasuk Gen Z");
        else if (tahunLahir > 1981)
            System.out.println("Anda termasuk Gen Millenial");
        else if (tahunLahir > 1965)
            System.out.println("Anda termasuk Gen X");
        else
            System.out.println("Anda termasuk Gen Baby Boomer");

        // potd - 3
        System.out.print("Silahkan masukkan kode Tiket Anda: ");
        String kodeTiket = scannerUser.next();

        // if (kodeTiket.equals("A"))
        //     System.out.println("Rute Perjalanan Anda adalah Surabaya - Malang");
        // else if (kodeTiket.equals("B"))
        //     System.out.println("Rute Perjalanan Anda adalah Surabaya - Kediri");
        // else if ("C".equals(kodeTiket))
        //     System.out.println("Rute Perjalanan Anda adalah Surabaya - Solo");
        // else if (kodeTiket.equals("D"))
        //     System.out.println("Rute Perjalanan Anda adalah Surabaya - Bali");
        // else if (kodeTiket.equals("E"))
        //     System.out.println("Rute Perjalanan Anda adalah Surabaya - Jakarta");
        // else
        //     System.out.println("Kode Tiket Anda salah!");

        switch (kodeTiket) {
            case "A":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Malang");
                break;
            case "B":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Kediri");
                break;
            case "C":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Solo");
                break;
            case "D":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Bali");
                break;
            case "E":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Jakarta");
                // break;
            default:
                System.out.println("Kode tiket Anda salah.");
        }
    }
}
