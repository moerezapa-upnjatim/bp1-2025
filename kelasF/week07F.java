public class week07F {
    
    public static void main(String[] args) {
        
        // potd -1
        System.out.println("==== POTD - 1 ====");
        for (int perulanganI = 1; perulanganI <= 2;perulanganI++) {
            // System.out.println("i = " + perulanganI);

            for (int perulanganJ = 1; perulanganJ <= 3; perulanganJ++) {
                // System.out.println("j = " + perulanganJ);

                System.out.println("i = " + perulanganI + " , j = " + perulanganJ);
            }

        }

        // potd -2
        System.out.println("==== POTD - 2 ====");
        for (int barisBintang =0; barisBintang < 6 ; barisBintang++) {
        
            for (int bintang = 1; bintang <= 5;bintang++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        // potd - 5
        System.out.println("==== POTD - 5 ====");
        for(int angka =1; angka <= 10; angka++) {
            if (angka % 2 == 0)
                continue;
            System.out.println("Angka ke-" + angka);
        }
    }
}
