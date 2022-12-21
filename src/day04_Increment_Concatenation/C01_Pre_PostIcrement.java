package day04_Increment_Concatenation;

public class C01_Pre_PostIcrement {
    public static void main(String[] args) {
        int sayi=20;
        // sayiyi 3 arttirin

        sayi = sayi+3;
        sayi += 3;

        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi);

        // sayinin degerini 2 azaltin
        sayi = sayi-2;
        sayi -= 2;
        sayi--;
        sayi--;

        System.out.println(sayi);

        sayi=10;
        //??? sayinin degerini 1 azaltin ve yazdirin ???
        sayi--;
        System.out.println(sayi);
        // Bu islemde ekranda gordugumuz 9, sayinin degeri 9

        sayi=10;
        // ??? sayiyi once yazdirin sonra 1 azaltin ???
        System.out.println(sayi);  // 10
        sayi--;                   // 9
        // Bu islemde ekranda gordugumuz 10, sayinin degeri 9


        sayi=10;
        sayi++;   // sayiyi 1 arttirir
        ++sayi;   // sayiyi 1 arttirir
        System.out.println(sayi);

        sayi=10;
        System.out.println(sayi++);  // 10
        /*
        - Java ayni satirda iki islem oldugundan siralma yapar
        - eger ++ variable dan sonra ise arttirma islemini sonra yapar
        - bu durumda once yazdirma yapıp sonra arttırır
         */
        System.out.println(sayi);  // 11

        sayi=10;
        System.out.println(++sayi);  // 11
        /*
        ++ variable dan önce ise ilk önce arttırma yapar sonra
        yazdirma islemini yapar
         */
       System.out.println(sayi);  // 11


    }
}
