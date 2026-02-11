
import java.util.Scanner;

// import java.util.*; * dipakai untuk dipakai import seluruh library

public class week05F {
    
    public static void main(String[] args) {
        
        // potd - 1
        // int uangDitarik = 100000;
        // Long saldoHato = 57000L;

        // if (saldoHato >= uangDitarik)
        //     System.out.println("Mohon ditunggu. Silahkan ambil uang Anda!");
        // else
        //     System.out.println("Uang Anda tidak cukup.");

        // potd - 2
        Scanner scannerPengguna = new Scanner(System.in);
        System.out.println("Silahkan masukkan Tahun Kelahiran Anda: ");
        int tahunKelahiran = scannerPengguna.nextInt();

        if (tahunKelahiran >= 2013)
            System.out.println("Anda termasuk Generasi Alpha");
        else if (tahunKelahiran >=1997)
            System.out.println("Anda termasuk Generasi Z");
        else if (tahunKelahiran >= 1981)
            System.out.println("Anda termasuk Generasi Millenial");
        else if (tahunKelahiran >= 1965)
            System.out.println("Anda termasuk Generasi X");
        else
            System.out.println("Anda termasuk Generasi Baby Boomer");

        System.out.println("Masukkan kode Tiket Anda");
        String kodeTiket = scannerPengguna.next();

        System.out.println("Hasil IF-ELSE");
        if (kodeTiket.equals("A"))
            System.out.println("Rute Perjalanan Anda adalah Surabaya - Malang");
        else if (kodeTiket.equals("B"))
            System.out.println("Rute Perjalanan Anda adalah Surabaya - Lumajang");
        else if ("C".equals(kodeTiket))
            System.out.println("Rute Perjalanan Anda adalah Surabaya - Madiun");
        else if (kodeTiket.equals("D"))
            System.out.println("Rute Perjalanan Anda adalah Surabaya - Karawang");
        else if (kodeTiket.equals("E"))
            System.out.println("Rute Perjalanan Anda adalah Surabaya - Jakarta");
        else
            System.out.println("Kode Tiket Anda salah!");

        System.out.println("Hasil SWITCH-CASE");
        switch(kodeTiket) {
            case "A":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Malang");
                break;
            case "B":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Lumajang");
                break;
            case "C":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Madiun");
                break;
            case "D":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Karawang");
                break;
            case "E":
                System.out.println("Rute Perjalanan Anda adalah Surabaya - Jakartaa");
                break;
        }

    }
}
