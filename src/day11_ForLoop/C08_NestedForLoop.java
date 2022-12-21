package day11_ForLoop;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // verilen inputa gore carpim tablosu olusturun
        int input = 4 ;
        /*
             1 2  3  4
             2 4  6  8
             3 6  9 12
             4 8 12 16
         */
        int carpim=1;
        // 1 2  3  4
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + " ");
        }

        System.out.println("");
        // 2 4  6  8
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");
        // 3 6  9 12
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }

        System.out.println("");
        // 4 8 12 16

        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~NESTED FOR LOOP ile  ~~~~~~~~~~~~~~~~");
        for (int i = 1; i <=input ; i++) {   // outer loop denir ve i'nin carpilacagi sayiyi kontrol edecek
            for (int j = 1; j <= input; j++) {  // inner loop denir ve onceki ornekteki i degiskenini kontrol eder
                carpim=i*j;
                System.out.print(carpim+" ");
            }
            System.out.println("");

        }

    }
}
