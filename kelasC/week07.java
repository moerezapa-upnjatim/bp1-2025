public class week07 {
    
    public static void main(String[] args) {
        
        // potd - 1
        // for (int perulanganPertama = 1; perulanganPertama <= 2; perulanganPertama++) {
        //     // System.out.println("i = " + perulanganPertama);

        //     for (int perulanganKedua = 1; perulanganKedua <= 3; perulanganKedua++) {
        //         // System.out.println("j= " + perulanganKedua);

        //         System.out.println("i= " + perulanganPertama + ", j = " + perulanganKedua);
        //     }
        // }

        // potd - 2
        // for (int perulanganBintang = 1; perulanganBintang <= 5; perulanganBintang++) {
        //     // System.out.println("Baris ke-" + perulanganBintang);
            
        //     for (int bintang = 0; bintang < 5; bintang++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        // potd - 4
        for (int angka = 1; angka <= 10; angka++) {
            if (angka  == 7)
                break;
                
            System.out.println("Angka ke-" + angka);
        }

        System.out.println("===== POTD - 5 =====");
        // potd - 5
        for (int angka = 1; angka <= 10; angka++) {
            if (angka % 2 == 0)
                continue;

            System.out.println("Angka ke-" + angka);
        }
    }
}
