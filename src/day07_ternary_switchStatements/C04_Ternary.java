package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {
        // Kullanicidan alinan deger
          // 100 den buyukse sayiyi 2 ile carpin
          // 100 den esit veya kucuk ise sayiya 10 ekleyin

        int input=45;
         // İF ELSE ile
        if(input>100){
            input *=2;
        }else{
            input+=10;
        }
        System.out.println("İf else ile : " +input);


        input=45;
        input=input>100 ? input*2 : input+10;
        System.out.println("Ternary ile : " +input);

        /*
        verilen inputu icncleyin
           eger 100 den buyukse bunu 5 e bolup bolum sonuncunun tek sayi olup olmadigini kontrol edin
           eger 100 den buyuk degilse 10 ile bolumunden kalani bulup bu kalani 5 arttir

        Bu tür kompleks islemleri Ternary ile yapmayız
         */

    }
}
