public class week07E {
    
    public static void main(String[] args) {
        
        // int bilanganA = 7;
        // int bilanganB = 2;

        // System.out.println(bilanganA + bilanganB);
        // System.out.println(bilanganA - bilanganB);
        // System.out.println(bilanganA * bilanganB);
        // System.out.println(bilanganA / bilanganB);
        // System.out.println(bilanganA % bilanganB);
        // System.out.println(Math.pow(bilanganA, bilanganB));

        // String nama1 = "Rizky";
        // String nama2 = "Cucu";
        // System.out.println(nama1 + nama2);

        // potd - 1
        System.out.println("==== POTD - 1 ====");
        for(int perulanganPertama = 1; perulanganPertama <= 2; perulanganPertama++) {
            // System.out.println("i= " + perulanganPertama);

            for (int perulanganJ = 1; perulanganJ <= 3; perulanganJ++) {
                // System.out.println("j= " + perulanganJ);
                System.out.println("i =" + perulanganPertama + ", j =" + perulanganJ);
            }
        }

        // potd - 2
        System.out.println("==== POTD - 2 ====");
        // for(int perulanganBintang =0; perulanganBintang < 5; perulanganBintang++) {
        //     System.out.print("* ");
        // }

        for(int barisBintang = 1; barisBintang <= 5; barisBintang++) {
            // System.out.println("");
            
            for(int perulanganBintang =0; perulanganBintang < 5; perulanganBintang++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        // potd - 5
        System.out.println("==== POTD - 5 ====");
        for( int perulangan = 1; perulangan <= 10; perulangan++) {
            if(perulangan % 2 ==0)
                continue;
            System.out.println("Angka ke-" + perulangan);
        }
    }
}
