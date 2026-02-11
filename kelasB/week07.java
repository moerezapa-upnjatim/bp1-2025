public class week07 {
    
    public static void main(String[] args) {
        
        // potd -1
        // for (int perulanganPertama = 1; perulanganPertama <= 2; perulanganPertama++) {
        //     // System.out.println("i= " + perulanganPertama);

        //     for(int perulanganKedua = 1; perulanganKedua <= 3; perulanganKedua+=1) {
        //         System.out.println("i= " + perulanganPertama + ", j= " + perulanganKedua);
        //     }
        // }

        // potd - 2
        for (int perulanganBintang = 1 ; perulanganBintang <= 5; perulanganBintang ++) {
            // System.out.println("Baris ke- "+ perulanganBintang);
            for (int bintang = 0; bintang < 5; bintang ++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // potd -5
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0)
                continue;
            System.out.println("Angka ke-" + i);
        }
        
    }
}
