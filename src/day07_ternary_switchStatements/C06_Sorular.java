package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {
        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin",
// 50’den kucukse "Maalesef kaldin" yazdirin.

        int input=25;
        System.out.println(input>=50 ? "Sinifi Gectin" : "Malesef kaldin");


       // Kullanicidan bir harf isteyin,
                // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
                // yoksa girilen harfi yazdirin
        char karakter='s';
        System.out.println(karakter>='a' && karakter<='z' ? (char) (karakter-32) : karakter);

        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input=-25;

         // |5| => 5      |-2| =>(-1) *(-2) => 2
        System.out.println(input>0 ? input : (-1)*input);



    }
}
