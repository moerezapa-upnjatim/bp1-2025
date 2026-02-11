import java.util.Scanner;

public class week06E {
    
    public static void main(String[] args) {
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");
        // System.out.println("Hello My Name Rizky");

        System.out.println("==== FOR STATEMENTS ====");
        // // for (initialization, condition, update)
        for(int perulangan = 1 ; perulangan <= 10; perulangan++) {
            System.out.println(perulangan + ". Hello My Name Rizky");
        }

        Scanner scannerInput = new Scanner(System.in);

        // System.out.print("Silahkan masukkan angka perulangan: ");
        // int jumlahPerulangan = scannerInput.nextInt();

        // for (int pengulangan = 1; pengulangan <= jumlahPerulangan; pengulangan++) {
        //     System.out.println("Angka ke-" + pengulangan);
        // }

        // for (int pengulangan = 1; pengulangan <= jumlahPerulangan; pengulangan+=2 ) {
        //     System.out.println("Angka ke-" + pengulangan);
        // }

        System.out.println("==== WHILE STATEMENT ====");
        int batasPengulangan = 1;
        while(batasPengulangan <= 10) {
            System.out.println("Angka ke-" + batasPengulangan);

            // batasPengulangan = batasPengulangan + 1;
            batasPengulangan *= 2;
        }

        System.out.println("==== DO-WHILE STATEMENT ====");
        int perulanganDoWhile = 12;
        do { 
            System.out.println("Angka ke-" + perulanganDoWhile);

            perulanganDoWhile = perulanganDoWhile + 1;
        } while(perulanganDoWhile <= 10);
    }
}
